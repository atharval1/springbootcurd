package com.employee.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
		String errorMessage = ex.getMessage();
		String jsonError = "{\"message\":\"" + errorMessage + "\"}";
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(jsonError);
	}
}
