package com.co.linadev.refactor_backend_mysql.domain.dto;

import com.co.linadev.refactor_backend_mysql.domain.valueobject.Country;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private Country country;
}
