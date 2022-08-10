package com.co.linadev.refactor_backend_mysql.application.service;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import com.co.linadev.refactor_backend_mysql.domain.entity.Employee;


import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {

    //get employees
    List<EmployeeDTO> listEmployee();

    // get employees by id
    Optional<EmployeeDTO> findById(Long id);

    // find employees by firstname
    List<EmployeeDTO> findAllByFirstNameContainingIgnoreCaseOrderByFirstName(String firstName);

    // find employees by last name
    List<EmployeeDTO> findAllByLastNameContainingIgnoreCaseOrderByLastName(String lastName);

    // update employee
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    // save a new employee
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    // delete employee by id
    void deleteEmployee(Long id);

    // delete all employees
    void deleteAllEmployees();
}
