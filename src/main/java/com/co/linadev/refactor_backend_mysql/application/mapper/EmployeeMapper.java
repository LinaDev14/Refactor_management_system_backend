package com.co.linadev.refactor_backend_mysql.application.mapper;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import com.co.linadev.refactor_backend_mysql.domain.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EmployeeMapper {

    // FROM EMPLOYEE TO EMPLOYEE_DTO
    public Function<Employee, EmployeeDTO> mapToEmployeeDTO(){

        return employee -> new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhoneNumber(),
                employee.getGender(),
                employee.getCountry()
        );

    }

    // FROM EMPLOYEE_DTO TO EMPLOYEE

    public Function<EmployeeDTO, Employee> mapToEmployeeEntity(){

        return employeeDTO -> new Employee(
            employeeDTO.getId(),
            employeeDTO.getFirstName(),
            employeeDTO.getLastName(),
            employeeDTO.getEmail(),
            employeeDTO.getPhoneNumber(),
            employeeDTO.getGender(),
            employeeDTO.getCountry()
        );
    }
}
