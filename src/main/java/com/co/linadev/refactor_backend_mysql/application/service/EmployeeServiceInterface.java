package com.co.linadev.refactor_backend_mysql.application.service;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Country;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Gender;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {

    //get employees
    List<EmployeeDTO> listEmployee();

    // get employees by id
    Optional<EmployeeDTO> findById(String id);

    // find employees by firstname
    List<EmployeeDTO> findAllByFirstNameContainingIgnoreCaseOrderByFirstName(String firstName);

    // find employees by last name
    List<EmployeeDTO> findAllByLastNameContainingIgnoreCaseOrderByLastName(String lastName);

    // find employees by country
    List<EmployeeDTO> findAllByCountryOrderByCountry(Country country);

    // find employees by gender
    List<EmployeeDTO> findAllByGender(Gender gender);

    // update employee
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    // save a new employee
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    // save employees
    List<EmployeeDTO> fillData(List<EmployeeDTO> employeeDTO);

    // delete employee by id
    void deleteEmployee(String id);

    // delete all employees
    void deleteAllEmployees();
}
