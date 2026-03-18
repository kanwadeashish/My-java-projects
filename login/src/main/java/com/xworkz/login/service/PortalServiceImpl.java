package com.xworkz.login.service;

import com.xworkz.login.DAO.PortalDAO;
import com.xworkz.login.DTO.StudentDTO;
import com.xworkz.login.entity.StudentEntity;
import com.xworkz.login.util.CryptoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortalServiceImpl implements PortalService {

    @Autowired
    PortalDAO portalDAO;

    @Override
    public String signUp(StudentDTO dto) {

        StudentEntity existing = portalDAO.getUserByEmail(dto.getEmail());

        if (existing == null) {

            dto.setPassword(CryptoUtil.encrypt(dto.getPassword()));

            StudentEntity entity = new StudentEntity();
            BeanUtils.copyProperties(dto, entity);

            return portalDAO.signUp(entity) ? "Registered successfully" : "Not Registered";
        }
        return "User already exists";
    }

    @Override
    public StudentDTO getUserByEmail(String email) {

        StudentEntity entity = portalDAO.getUserByEmail(email);

        if (entity != null) {
            StudentDTO dto = new StudentDTO();
            BeanUtils.copyProperties(entity, dto);
            return dto;
        }
        return null;
    }

    @Override
    public boolean loginValidation(String email, String password) {

        String encrypted = portalDAO.getPasswordByEmail(email);

        if (encrypted != null) {
            String decrypted = CryptoUtil.decrypt(encrypted);
            return decrypted.equals(password);
        }
        return false;
    }

    @Override
    public boolean updateUser(StudentDTO dto) {

        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(dto, entity);

        return portalDAO.updateUser(entity);
    }
}