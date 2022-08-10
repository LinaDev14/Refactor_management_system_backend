package com.co.linadev.refactor_backend_mysql.domain.entity;

import com.co.linadev.refactor_backend_mysql.domain.valueobject.Country;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Gender;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private Country country;
}
