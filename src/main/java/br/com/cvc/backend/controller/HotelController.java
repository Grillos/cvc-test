package br.com.cvc.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.backend.domain.Hotel;
import br.com.cvc.backend.dto.HotelDto;
import br.com.cvc.backend.service.HotelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/v1/hotels")
@Api(tags = "Hotel Controller")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
    
    @GetMapping("/{id}")
    @ApiOperation(value = "Find hotel by id", notes = "Find user applying parameter", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({
			@ApiResponse(code = 200, message = "Find hotel request successfully executed", response = HotelDto.class),
			@ApiResponse(code = 404, message = "The request resource was not found") })
    public List<Hotel> findById(@PathVariable Long id) {
    	return hotelService.findById(id);
    }
}
