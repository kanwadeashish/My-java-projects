package com.xworkz.portal.service;

import com.xworkz.portal.DTO.UserDTO;

public interface UserService {

    String registrationValidation(UserDTO userDTO);

    UserDTO checkingExistUserByEmail(String email);

    boolean loginValidation(String email, String password);

}
