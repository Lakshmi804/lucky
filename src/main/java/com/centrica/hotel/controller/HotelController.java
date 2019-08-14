package com.centrica.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.centrica.hotel.dto.Hotel;

@RestController
public class HotelController {

	@Autowired
	private com.centrica.hotel.service.HotelService hotelservice;
	
	@RequestMapping("/items")
	public  List<Hotel> getItems() {
		return hotelservice.getItems();
	}

	@RequestMapping("/{item}")
	public Hotel getItem( @PathVariable String item) {
		return hotelservice.getItem(item);
	}

	@PostMapping("")
	public List<Hotel> addHotel(@RequestBody Hotel hotel) {
		return hotelservice.addHotel(hotel);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{item}")
	public List<Hotel> updateHotel(@RequestBody Hotel hotel, @PathVariable String item) {
		return hotelservice.updateHotel(item, hotel);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{item}")
	public List<Hotel> deleteHotel(@PathVariable String item) {
		return hotelservice.deleteHotel(item);
	}
}