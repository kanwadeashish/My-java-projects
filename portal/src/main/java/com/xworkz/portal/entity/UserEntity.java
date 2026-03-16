package com.xworkz.portal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "portal_tb")
@NamedQuery(name="findByEmail",query = "select entity.password from StudentEntity entity where entity.email=:studentEmail")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dob;
    private Integer age;
    private String gender;
    private String location;
    @Column(name = "",unique = true)
    private String email;
    @Column(name = "",unique = true)
    private Long phNumber;
    private String password;
//    private String confirmPassword;

}
