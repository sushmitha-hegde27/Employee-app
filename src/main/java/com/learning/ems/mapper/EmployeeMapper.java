package com.learning.ems.mapper;

import com.learning.ems.dto.EmployeeDto;
import com.learning.ems.entity.Employee;

public class EmployeeMapper {

	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getEmail(), employee.getFirstName(),
				employee.getLastName());
		return employeeDto;

	}

	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee(employeeDto.getId(), employeeDto.getEmail(), employeeDto.getFirstName(),
				employeeDto.getLastName());
		return employee;

	}

}
