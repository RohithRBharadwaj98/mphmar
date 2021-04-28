package com.mph.exception;

public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {

	}

	@Override
	public String toString() {
		return "Employee NotFound.. please check the credential";
	}

	public void UserNotFoundException() {
		System.out.println("From Employee not found exception");
	}

}