package com.co.linadev.refactor_backend_mysql.domain.repository;

import com.co.linadev.refactor_backend_mysql.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // find employees by name

    // find employees by first name

    // find employees by country

    // find employees by gender

    // find employees by name and country

    // find employees by countries and gender
}
