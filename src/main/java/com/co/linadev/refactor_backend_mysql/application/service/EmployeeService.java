package com.co.linadev.refactor_backend_mysql.application.service;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Country;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Gender;

import java.util.List;
import java.util.Optional;

public class EmployeeService implements EmployeeServiceInterface{
    @Override
    public List<EmployeeDTO> listEmployee() {

        return null;
    }

    @Override
    public Optional<EmployeeDTO> findById(Long id) {

        return Optional.empty();
    }

    @Override
    public List<EmployeeDTO> findAllByFirstNameContainingIgnoreCaseOrderByFirstName(String firstName) {

        return null;
    }

    @Override
    public List<EmployeeDTO> findAllByLastNameContainingIgnoreCaseOrderByLastName(String lastName) {

        return null;
    }

    @Override
    public List<EmployeeDTO> findAllByCountryOrderByCountry(Country country) {

        return null;
    }

    @Override
    public List<EmployeeDTO> findAllByGender(Gender gender) {

        return null;
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {

        return null;
    }

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

        return null;
    }

    @Override
    public List<EmployeeDTO> fillData(List<EmployeeDTO> employeeDTO) {

        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public void deleteAllEmployees() {

    }

}
