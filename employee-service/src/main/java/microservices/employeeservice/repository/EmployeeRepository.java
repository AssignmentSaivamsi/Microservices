package microservices.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
