package microservices.employeeservice.service;

import microservices.employeeservice.dto.APIResponseDto;
import microservices.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
