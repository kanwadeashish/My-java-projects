package com.xworkz.login.DAO;

import com.xworkz.login.entity.StudentEntity;

public interface PortalDAO {

    boolean signUp(StudentEntity studentEntity);

    StudentEntity getUserByEmail(String email);

    String getPasswordByEmail(String email);

    boolean updateUser(StudentEntity entity);
}
