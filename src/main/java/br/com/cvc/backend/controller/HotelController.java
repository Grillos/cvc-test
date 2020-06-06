package br.com.cvc.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.backend.dto.HotelDto;
import br.com.cvc.backend.service.HotelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/v1")
@Api(tags = "Hotel Controller")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
    
    @GetMapping("/cities/{id}/hotels")
    @ApiOperation(value = "Find hotel by city id", notes = "Find hotel applying parameter", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({
			@ApiResponse(code = 200, message = "Find hotel request successfully executed", response = HotelDto.class),
			@ApiResponse(code = 404, message = "The request resource was not found") })
    public ResponseEntity<List<HotelDto>> findByCityId(@PathVariable Long id) {
    	return new ResponseEntity<>(hotelService.findByCityId(id), HttpStatus.OK);
    }
    
    @GetMapping("/hotels/{id}")
    @ApiOperation(value = "Find hotel by city id", notes = "Find hotel applying parameter", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({
			@ApiResponse(code = 200, message = "Find hotel request successfully executed", response = HotelDto.class),
			@ApiResponse(code = 404, message = "The request resource was not found") })
    public ResponseEntity<HotelDto> findById(@PathVariable Long id) {
    	return new ResponseEntity<>(hotelService.findById(id), HttpStatus.OK);
    }
}
