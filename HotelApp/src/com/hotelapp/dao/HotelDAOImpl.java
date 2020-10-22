package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotel();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		for(Hotel hotel:showHotel()) {
			if(hotel.getHotelid()==id) {
				return hotel;
			}
				
		}
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> hl=new ArrayList<>();
		for(Hotel hotel:showHotel()) {
			if(hotel.getCity().equals(city))
			{
				hl.add(hotel);
			}
		}
		
		return hl;
	}

	@Override
	public List<Hotel> getByCuisine(String cusine) {
		// TODO Auto-generated method stub
		List<Hotel> hc=new ArrayList<>();
		for(Hotel hotel:showHotel()) {
			if(hotel.getCuisine().equals(cusine))
			{
				hc.add(hotel);
			}
		}
		
		return hc;
	}
	
	private List<Hotel> showHotel()
	{
		return Arrays.asList(
				new Hotel("Raj",1,"mysore","indian"),
				new Hotel("Taj",2,"mysore","indian"),
				new Hotel("Viswa",3,"mysore","chinese"),
				new Hotel("Rose",4,"mysore","chinies")	
				);
	}

}
