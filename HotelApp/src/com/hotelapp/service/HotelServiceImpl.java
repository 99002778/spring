package com.hotelapp.service;

import java.util.List;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.dao.HotelDAOImpl;
import com.hotelapp.model.Hotel;

public class HotelServiceImpl implements HotelService {
	HotelDAO hd=new HotelDAOImpl();

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hd.getAllHotels();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return hd.getById(id);
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hd.getByCity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cusine) {
		// TODO Auto-generated method stub
		return hd.getByCuisine(cusine);
	}

}
