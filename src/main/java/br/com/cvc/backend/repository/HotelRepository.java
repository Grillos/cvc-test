package br.com.cvc.backend.repository;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cvc.backend.domain.Hotel;

@FeignClient(name = "hotel", url = "${hotel.service.url}")
public interface HotelRepository {

	@RequestMapping(method = RequestMethod.GET, value = "/hotels/avail/{id}", consumes = "application/json")
	List<Hotel> findById(@PathVariable("id") Long id);
	
}