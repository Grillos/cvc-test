package br.com.cvc.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cvc.backend.domain.Hotel;
import br.com.cvc.backend.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	public List<Hotel> findById(Long id) {
		return hotelRepository.findById(id);
	}
	

}
