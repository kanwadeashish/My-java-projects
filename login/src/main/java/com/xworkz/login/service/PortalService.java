package com.xworkz.login.service;

import com.xworkz.login.DTO.StudentDTO;

public interface PortalService {

    String signUp(StudentDTO dto);

    StudentDTO getUserByEmail(String email);

    boolean loginValidation(String email, String password);

    boolean updateUser(StudentDTO dto);
}