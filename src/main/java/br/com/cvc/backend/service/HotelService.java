package br.com.cvc.backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cvc.backend.dto.HotelDto;
import br.com.cvc.backend.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	public List<HotelDto> findByCityId(Long id) {
		return hotelRepository
				.findByCityId(id)
				.stream()
				.map(HotelDto::new)
				.collect(Collectors.toList());
	}
	
	public HotelDto findById(Long id) {
		return new HotelDto(hotelRepository.findById(id).get(0));
	}
	

}
