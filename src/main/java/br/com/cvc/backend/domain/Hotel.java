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
public class Hotel {

	private Long id;
	
	private String name;
	
	private Long cityCode;
	
	private String cityName;
	
	private List<Room> rooms;
	
}
