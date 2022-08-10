package com.co.linadev.refactor_backend_mysql.infraestructure.queries;

import com.co.linadev.refactor_backend_mysql.application.service.EmployeeService;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import com.co.linadev.refactor_backend_mysql.domain.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
    // localhost:8080/api/query/listEmployees
    @GetMapping("/listEmployees")
    public ResponseEntity<List<EmployeeDTO>> listEmployee(){
        return new ResponseEntity<>(employeeService.listEmployee(), HttpStatus.OK);
    }

    // find by id
    @GetMapping("/findEmployeeById")
    public ResponseEntity<Optional<EmployeeDTO>> findById(@RequestParam Long id){
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/findByFirstName")
    public ResponseEntity<List<Employee>>findAllByFirstNameContainingIgnoreCaseOrderByFirstName(@RequestParam(name="first") String firstName){
        return new ResponseEntity<>(employeeService.findAllByFirstNameContainingIgnoreCaseOrderByFirstName(firstName), HttpStatus.OK);
    }

    @GetMapping("/findByLastName")
    public ResponseEntity<List<Employee>>findAllByLastNameContainingIgnoreCaseOrderByLastName(@RequestParam(name="last") String lastName){
        return new ResponseEntity<>(employeeService.findAllByLastNameContainingIgnoreCaseOrderByLastName(lastName), HttpStatus.OK);
    }


}
