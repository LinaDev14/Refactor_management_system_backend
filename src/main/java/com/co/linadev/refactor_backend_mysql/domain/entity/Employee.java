package com.co.linadev.refactor_backend_mysql.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
