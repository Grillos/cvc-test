package br.com.cvc.backend.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cvc.backend.domain.Hotel;
import br.com.cvc.backend.domain.Room;
import br.com.cvc.backend.dto.TravelDto;
import br.com.cvc.backend.repository.HotelRepository;
import br.com.cvc.backend.search.controller.TravelSearchCriteria;

@Service
public class TravelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	public TravelDto find(TravelSearchCriteria search) {
		
		/* CRIAR LOGICA PARA CALCULAR VALORES */
		hotelRepository.findByCityId(search.getCityCode())
		.stream()
		.map(hotel -> calculatevalues(search, hotel)).collect(Collectors.toList());
		
		return new TravelDto();
	}
	
	private TravelDto calculatevalues(TravelSearchCriteria search, Hotel hotel) {
		Period period = Period.between(LocalDate.parse(search.getCheckin()), LocalDate.parse(search.getCheckout()));
		BigDecimal totalPrice = BigDecimal.ZERO;
		
		BigDecimal sum = hotel.getRooms().stream()
                .map(x -> x.getPrice().getAdult().multiply(new BigDecimal(period.getDays())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(":::::::::::::: "+ sum);
		/*
		 * for (Room room : hotel.getRooms()) {
		 * 
		 * System.out.println("::::::::::::: VALUE ADULT CALCULETED "+room.getPrice().
		 * getAdult().multiply(new BigDecimal(period.getDays())));
		 * System.out.println("::::::::::::: VALUE CHILD CALCULETED "+room.getPrice().
		 * getChild().multiply(new BigDecimal(period.getDays()))); totalPrice.add(new
		 * BigDecimal(1)); }
		 */
		System.out.println(":::::::::::::: "+totalPrice);
		return TravelDto
				.builder()
				.build();
	}

	

}
