package com.centrica.hotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.centrica.hotel.dto.Hotel;
@Service
public class HotelService {
	public  List<Hotel> hotelList = new ArrayList<>(); 
	
	public  List<Hotel> getItems() {
		Hotel hotel = new Hotel("chicken biryani", 1000); 
		hotelList.add(hotel);
		Hotel hotel1=new Hotel("mutton biryani",789);
		hotelList.add(hotel1);
		return hotelList;
	}

	public Hotel getItem(String item) {
		return hotelList.stream().filter(t -> t.getItemName().equals(item)).findFirst().get();
	}

	public List<Hotel> addHotel(Hotel hotel) {
		hotelList.add(hotel);
		return hotelList;
	}

	public List<Hotel> updateHotel(String item, Hotel hotel) {
		for (int i = 0; i < hotelList.size(); i++) {
			Hotel h = hotelList.get(i);
          if (h.getItemName().equals(item)) {
				hotelList.set(i, hotel);
			}
		}
		return hotelList;
	}

	public List<Hotel> deleteHotel(String item) {
		for (int i = 0; i < hotelList.size(); i++) {
			Hotel h = hotelList.get(i);
			if ((h.getItemName().equals(item))) {
				hotelList.removeIf(t -> t.getItemName().equals(item));
			}
		}
		return hotelList;
	}
}
