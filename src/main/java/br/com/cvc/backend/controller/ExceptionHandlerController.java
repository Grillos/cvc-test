package br.com.cvc.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.cvc.backend.enumarations.ExceptionEnum;
import br.com.cvc.backend.exception.ErrorResponseException;
import br.com.cvc.backend.exception.Response;
import feign.FeignException.BadRequest;

@RestControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(ErrorResponseException.class)
	public ResponseEntity<Response> errorResponseExceptionHandler(ErrorResponseException ex) {
		return new ResponseEntity<>(ex.getResponse(), ex.getStatus());
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<Response> nullPointerException(NullPointerException ex) {
		return new ResponseEntity<>(
				Response.builder()
						.code(ExceptionEnum.INTERNAL_SERVER_ERROR.getId())
						.description(ExceptionEnum.INTERNAL_SERVER_ERROR.getDescription())
						.message(ex.getMessage())
						.build(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(BadRequest.class)
	public ResponseEntity<Response> nullPointerException(BadRequest ex) {
		return new ResponseEntity<>(
				Response.builder()
						.code(ExceptionEnum.BAD_REQUEST.getId())
						.description(ExceptionEnum.BAD_REQUEST.getDescription())
						.message(ex.getMessage())
						.build(),
				HttpStatus.BAD_REQUEST);
	}

}
