package br.com.cvc.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    private Long roomID;
	
	private String categoryName;
	
	private Price price;
	
}
