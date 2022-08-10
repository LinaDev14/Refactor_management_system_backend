package com.co.linadev.refactor_backend_mysql.domain.entity;

import javax.persistence.Entity;

@Entity
public class Employee {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
}
