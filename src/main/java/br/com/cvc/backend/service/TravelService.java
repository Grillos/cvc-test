package br.com.cvc.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cvc.backend.dto.TravelDto;
import br.com.cvc.backend.repository.HotelRepository;
import br.com.cvc.backend.search.controller.TravelSearchCriteria;

@Service
public class TravelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	public TravelDto find(TravelSearchCriteria search) {
		return new TravelDto();
	}
	

}
