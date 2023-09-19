package com.infy.models;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@Log4j2
public class Employee {

	private int empId;
	private String empName;
	private String empAddress;
}
