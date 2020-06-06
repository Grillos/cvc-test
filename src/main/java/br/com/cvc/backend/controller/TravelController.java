package br.com.cvc.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.backend.dto.TravelDto;
import br.com.cvc.backend.search.controller.TravelSearchCriteria;
import br.com.cvc.backend.service.TravelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/v1/travels")
@Api(tags = "Travel Controller")
public class TravelController {
	
	@Autowired
	private TravelService travelService;
    
    @GetMapping
    @ApiOperation(value = "Find travel", notes = "Find travel applying parameter", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({
			@ApiResponse(code = 200, message = "Find travel request successfully executed", response = TravelDto.class),
			@ApiResponse(code = 404, message = "The request resource was not found") })
    public ResponseEntity<TravelDto> findById(TravelSearchCriteria search) {
    	return new ResponseEntity<>(travelService.find(search), HttpStatus.OK);
    }
}
