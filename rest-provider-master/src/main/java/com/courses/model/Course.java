package com.courses.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="courseid")
public class Course {
@Id
   private Integer courseid;
@Column
   private String  name;
@Column
   private String  description;
@Column
   private double price;
@Column
   private double rating;
@Column
   private Integer duration;
@Column
   private String filename;
   
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "username")
   @JsonIgnoreProperties("courses")
   private User user;
   
   
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Integer getCourseid() {
	return courseid;
}
public void setCourseid(Integer courseid) {
	this.courseid = courseid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public Integer getDuration() {
	return duration;
}
public void setDuration(Integer duration) {
	this.duration = duration;
}
public String getFilename() {
	return filename;
}
public void setFilename(String filename) {
	this.filename = filename;
}
   
   
}
