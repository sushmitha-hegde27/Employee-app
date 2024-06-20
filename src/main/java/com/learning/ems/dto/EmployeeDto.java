package com.learning.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDto {

	private Long id;
	private String email;
	private String firstName;
	private String lastName;

}
