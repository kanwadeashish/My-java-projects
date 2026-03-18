package com.xworkz.login.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private int id;
    private String name;
    private String userName;
    private String email;
    private Long contactNumber;
    private String password;
    private String confirmPassword;

}
