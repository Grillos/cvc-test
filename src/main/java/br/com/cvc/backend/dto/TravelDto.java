package br.com.cvc.backend.dto;

import java.util.List;

import br.com.cvc.backend.domain.Travel;
import br.com.cvc.backend.domain.TravelRoom;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TravelDto {
	
	public TravelDto(Travel travel) {
		this.cityName = travel.getCityName();
		this.rooms = travel.getRooms();
	}
	
	private String cityName;
	
	private List<TravelRoom> rooms;
}
