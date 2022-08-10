package com.co.linadev.refactor_backend_mysql.domain.repository;

import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import com.co.linadev.refactor_backend_mysql.domain.entity.Employee;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Country;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // find employees by first name
    List<EmployeeDTO> findAllByFirstNameContainingIgnoreCaseOrderByFirstName(String firstName);
    // find employees by last name
    List<EmployeeDTO> findAllByLastNameContainingIgnoreCaseOrderByLastName(String lastName);



}
