package com.co.linadev.refactor_backend_mysql.infraestructure.queries;

import com.co.linadev.refactor_backend_mysql.application.service.EmployeeService;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/query")
@RequiredArgsConstructor
public class EmployeeQueryController {


    private final EmployeeService employeeService;

    /*
     * GET -> consult
     * POST -> create
     * PUT -> Edit
     * DELETE -> delete
     * */

    // list employees
    @GetMapping("/listEmployees")
    public ResponseEntity<List<EmployeeDTO>> listEmployee(){
        return new ResponseEntity<>(employeeService.listEmployee(), HttpStatus.OK);
    }
}
