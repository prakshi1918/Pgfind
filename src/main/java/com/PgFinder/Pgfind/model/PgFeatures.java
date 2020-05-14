package com.PgFinder.Pgfind.model;


import javax.persistence.Entity;
import javax.persistence.Id;




@Entity(name="PgFeatures")
public class PgFeatures {
	
	@Id
	private long id;
	private String ac;
	private String hot_water;
	private String food_type;
	private String room;
	private String tv;
	private String oven;
	private String gender;
	private String other;
	private String contact;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getHot_water() {
		return hot_water;
	}
	public void setHot_water(String hot_water) {
		this.hot_water = hot_water;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getTv() {
		return tv;
	}
	public void setTv(String tv) {
		this.tv = tv;
	}
	public String getOven() {
		return oven;
	}
	public void setOven(String oven) {
		this.oven = oven;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}

	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "PgFeatures [id=" + id + ", ac=" + ac + ", hot_water=" + hot_water + ", food_type=" + food_type
				+ ", room=" + room + ", tv=" + tv + ", oven=" + oven + ", gender=" + gender + ", other=" + other
				+ ", contact=" + contact + "]";
	}
	
	
	

}
