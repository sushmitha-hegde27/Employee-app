package com.learning.ems.service.impl;

import org.springframework.stereotype.Service;

import com.learning.ems.dto.EmployeeDto;
import com.learning.ems.entity.Employee;
import com.learning.ems.exception.ResourceNotFoundException;
import com.learning.ems.mapper.EmployeeMapper;
import com.learning.ems.repository.EmployeeRepository;
import com.learning.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("employee not found"));
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

}
