package com.xworkz.portal.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String dob;
    private Integer age;
    private String gender;
    private String location;
    private String email;
    private Long phNumber;
    private String password;
    private String confirmPassword;

}
