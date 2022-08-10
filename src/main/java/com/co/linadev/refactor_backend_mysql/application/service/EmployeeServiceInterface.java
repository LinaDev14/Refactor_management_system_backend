package com.co.linadev.refactor_backend_mysql.application.service;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {

    //get employees
    List<EmployeeDTO> listEmployee();

    // get employees by id
    Optional<EmployeeDTO> findById(Long id);
    // find employees by name

    // find employees by first name

    // find employees by country

    // find employees by gender

    // find employees by name and country

    // find employees by countries and gender

    // update employee

    // save a new employee

    // save employees
    List<EmployeeDTO> fillData(List<EmployeeDTO> employeeDTO);

    // delete employee by id

    // delete all employees
}
