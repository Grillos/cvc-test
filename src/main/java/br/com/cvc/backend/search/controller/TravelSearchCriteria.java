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
@ApiModel(description = "The basic informations about travel", value = "Travel")
public class TravelSearchCriteria {
	
	@ApiModelProperty(value = "The city code for search travel", required = true, position = 1, dataType = "long", example = "1")
	private Long cityCode;
	
	@ApiModelProperty(value = "The checkin for search travel", required = true, position = 2, dataType = "string", example = "2020-01-01")
	private String checkin;
	
	@ApiModelProperty(value = "The checkout for search travel", required = true, position = 3, dataType = "string", example = "2020-01-05")
	private String checkout;
	
	@ApiModelProperty(value = "The quantity adult for search travel", required = true, position = 4, dataType = "long", example = "1")
	private Long qtdAdult;
	
	@ApiModelProperty(value = "The quantity child for search travel", required = true, position = 5, dataType = "long", example = "1")
	private Long qtdChild;
	

}
