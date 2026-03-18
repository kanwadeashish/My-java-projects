package com.xworkz.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "login_portal_tb")

@NamedQueries({
        @NamedQuery(
                name = "findByEmail",
                query = "select entity from StudentEntity entity where entity.email=:studentEmail"
        ),
        @NamedQuery(
                name = "getPasswordByEmail",
                query = "select entity.password from StudentEntity entity where entity.email=:studentEmail"
        )
})
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String userName;

    @Column(unique = true)
    private Long contactNumber;

    private String password;
}