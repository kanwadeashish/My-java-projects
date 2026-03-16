package com.xworkz.portal.service;

import com.xworkz.portal.DAO.UserDAO;
import com.xworkz.portal.DTO.UserDTO;
import com.xworkz.portal.entity.UserEntity;
import com.xworkz.portal.util.CryptoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

    @Override
    public String registrationValidation(UserDTO userDTO) {
        UserDTO email = checkingExistUserByEmail(userDTO.getEmail());
        if (email == null) {

            // Encrypting password here//
            String encryptedPassword = CryptoUtil.encrypt(userDTO.getPassword());
            userDTO.setPassword(encryptedPassword);

            UserEntity userEntity = new UserEntity();
            BeanUtils.copyProperties(userDTO, userEntity);
            boolean saveDB = userDAO.userSaveDB(userEntity);
            if (saveDB) {
                return "Registration Done";
            }
            return "Registration Failed...!";
        }
        return "User already exist";

    }

    @Override
    public UserDTO checkingExistUserByEmail(String email) {
        UserEntity userEntity = userDAO.checkingExistUserInDBByEmail(email);
        if (userEntity != null) {
            UserDTO userDTO = new UserDTO();
            BeanUtils.copyProperties(userEntity, userDTO);
            return userDTO;
        }
        return null;
    }

    @Override
    public boolean loginValidation(String email, String password) {
        String encryptedPasswordFromDB = userDAO.loginDataCheckInDB(email);
        if (encryptedPasswordFromDB != null) {

            //Decryption password//
            String decryptedPassword = CryptoUtil.decrypt(encryptedPasswordFromDB);
            if (decryptedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
