package com.hotelapp.model;

public class Hotel {
	String name;
	Integer hotelid;
	String city;
	String Cuisine;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String name, Integer hotelid, String city, String cuisine) {
		super();
		this.name = name;
		this.hotelid = hotelid;
		this.city = city;
		Cuisine = cuisine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHotelid() {
		return hotelid;
	}
	public void setHotelid(Integer hotelid) {
		this.hotelid = hotelid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", hotelid=" + hotelid + ", city=" + city + ", Cuisine=" + Cuisine + "]";
	}
	
	
}
