package com.co.linadev.refactor_backend_mysql.application.service;
import com.co.linadev.refactor_backend_mysql.application.mapper.EmployeeMapper;
import com.co.linadev.refactor_backend_mysql.domain.dto.EmployeeDTO;
import com.co.linadev.refactor_backend_mysql.domain.repository.EmployeeRepository;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Country;
import com.co.linadev.refactor_backend_mysql.domain.valueobject.Gender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService implements EmployeeServiceInterface{

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

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

        return employeeMapper.mapToEmployeeDTO()
                .apply(employeeRepository.save(employeeMapper.mapToEmployeeEntity()
                        .apply(employeeDTO)
                ));
    }

    @Override
    public List<EmployeeDTO> fillData(List<EmployeeDTO> employeeDTO) {

        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }

}
