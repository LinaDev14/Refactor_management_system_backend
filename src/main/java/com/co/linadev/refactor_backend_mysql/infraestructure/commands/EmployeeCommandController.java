package com.co.linadev.refactor_backend_mysql.infraestructure.commands;

import com.co.linadev.refactor_backend_mysql.application.service.EmployeeService;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/command/")
@RequiredArgsConstructor
public class EmployeeCommandController {

    /*
     * GET -> consult
     * POST -> create
     * PUT -> Edit
     * DELETE -> delete
     * */

    private final EmployeeService employeeService;

    // save Employee
    // localhost:8080/api/command/saveEmployee
    @PostMapping("saveEmployee")
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);
    }

    // update employee
    @PutMapping("/updateEmployee")
    public ResponseEntity<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO employeeDTO ){
        return new ResponseEntity<>(employeeService.updateEmployee(employeeDTO), HttpStatus.ACCEPTED);
    }


    // Delete Employee
    // localhost:8080/api/command/deleteEmployee?id=id
    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Delete All
    @DeleteMapping("/deleteAll")
    public ResponseEntity<HttpStatus> deleteAllEmployees(){
        employeeService.deleteAllEmployees();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
