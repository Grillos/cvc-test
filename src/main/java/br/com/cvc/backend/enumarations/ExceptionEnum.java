package br.com.cvc.backend.enumarations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {
	
	NO_CONTENT(1, "No Content"),
	NOT_FOUND(2, "Not Found"),
	INTERNAL_SERVER_ERROR(3, "Internal Server Error, Contact Us"),
	BAD_REQUEST(4, "Invalid Token");
	
	Integer id;
	String description;

}
