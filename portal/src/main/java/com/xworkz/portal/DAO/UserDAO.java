package com.xworkz.portal.DAO;

import com.xworkz.portal.entity.UserEntity;

public interface UserDAO {

    boolean userSaveDB(UserEntity userEntity);

    UserEntity checkingExistUserInDBByEmail(String email);

    String loginDataCheckInDB(String email);

}
