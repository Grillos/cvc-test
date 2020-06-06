package br.com.cvc.backend.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Travel {

	private Long id;
		
	private String cityName;
	
	private List<TravelRoom> rooms;
	
}
