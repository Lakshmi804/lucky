package com.centrica.hotel.dto;

public class Hotel {
	
	private String itemName;
	private Integer itemCost;

	public Hotel() {
	}

	public Hotel(String itemName, Integer itemCost) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemCost() {
		return itemCost;
	}
	
//	static List<Hotel> getHotel(){
//		List<Hotel> tmpList = new ArrayList<>();
//		Hotel hotel = new Hotel("chicken biryani", 1000);
//		Hotel hotel2 = new Hotel("mutton biryani", 345);
//		return tmpList;
//	}

	public void setItemCost(Integer itemCost) {
		this.itemCost = itemCost;
	}

}
