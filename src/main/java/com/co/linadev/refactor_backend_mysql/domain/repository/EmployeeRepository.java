package com.co.linadev.refactor_backend_mysql.domain.repository;

import com.co.linadev.refactor_backend_mysql.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
