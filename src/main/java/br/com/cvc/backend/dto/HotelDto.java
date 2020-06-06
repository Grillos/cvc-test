package br.com.cvc.backend.dto;

import java.util.List;

import br.com.cvc.backend.domain.Hotel;
import br.com.cvc.backend.domain.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
	
	public HotelDto(Hotel hotel) {
		this.name = hotel.getName();
		this.cityCode = hotel.getCityCode();
		this.rooms = hotel.getRooms();
	}
	
	private String name;
	
	private Long cityCode;
	
	private String cityName;
	
	private List<Room> rooms;
}
