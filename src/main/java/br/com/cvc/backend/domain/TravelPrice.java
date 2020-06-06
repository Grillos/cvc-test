package br.com.cvc.backend.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TravelPrice {

	private BigDecimal pricePerDayAdult;
	
	private BigDecimal pricePerDayChild;
	
	
}
