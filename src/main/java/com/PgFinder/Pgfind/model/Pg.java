package com.PgFinder.Pgfind.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "pg")
public class Pg {

	@Id
	private long id;
	private String name;
	private String address;
	private String city;
	private String area;
	private int food_rate;
	private int room_rate;
	private int services_rate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getFood_rate() {
		return food_rate;
	}
	public void setFood_rate(int food_rate) {
		this.food_rate = food_rate;
	}
	public int getRoom_rate() {
		return room_rate;
	}
	public void setRoom_rate(int room_rate) {
		this.room_rate = room_rate;
	}
	public int getServices_rate() {
		return services_rate;
	}
	public void setServices_rate(int services_rate) {
		this.services_rate = services_rate;
	}
	@Override
	public String toString() {
		return "Pg [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", area=" + area
				+ ", food_rate=" + food_rate + ", room_rate=" + room_rate + ", services_rate=" + services_rate + "]";
	}
	
	
	
	
}
