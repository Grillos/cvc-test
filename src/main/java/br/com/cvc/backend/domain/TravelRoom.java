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
public class TravelRoom {

    private Long roomID;
	
	private String categoryName;
	
	private BigDecimal totalPrice;
	
	private TravelPrice priceDetail;
	
}
