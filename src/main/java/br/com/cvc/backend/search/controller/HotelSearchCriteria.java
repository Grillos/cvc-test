package br.com.cvc.backend.search.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "The basic informations about user", value = "User")
public class HotelSearchCriteria {
	
	@ApiModelProperty(value = "The name for search ranking", required = false, position = 1, dataType = "string", example = "Robson grillo")
	private String name;
	
	@ApiModelProperty(value = "The email for search ranking", required = false, position = 2, dataType = "string", example = "email@email.com.br")
	private String email;
	

}
