package com.lzhwy.pojo;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String description;
	private char sex;
	private String phone;
	private boolean isMarried;
	private byte[] image;
	private LocalDate birthDay;
	
	public Customer(String name, String email, String password, String address, String description, char sex, String phone,
			boolean isMarried, byte[] image, LocalDate birthDay) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.description = description;
		this.sex = sex;
		this.phone = phone;
		this.isMarried = isMarried;
		this.image = image;
		this.birthDay = birthDay;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
				+ address + ", description=" + description + ", sex=" + sex + ", phone=" + phone + ", isMarried="
				+ isMarried + ", image=" + Arrays.toString(image) + ", birthDay=" + birthDay + "]";
	}
	
	
	
}
