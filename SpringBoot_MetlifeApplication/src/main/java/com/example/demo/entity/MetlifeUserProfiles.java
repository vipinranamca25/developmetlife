package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MetlifeUserProfiles")
public class MetlifeUserProfiles {
	@Id
	@GeneratedValue
	private Integer userId;
	
	private String position;
	private String location;
	private Integer age;
	private String date;
	private Double salary;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MetlifeUserProfiles [userId=" + userId + ", position=" + position + ", location=" + location + ", age="
				+ age + ", date=" + date + ", salary=" + salary + "]";
	}
	
	

}
