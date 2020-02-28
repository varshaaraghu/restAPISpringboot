package com.courses.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Reviews {
@Id
  private Integer reviewsno;
@Column
  private String name;
@Column
  private String email;
@Column
  private String message;
@Column
  private String reviewdate;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "courseid")
  Course course;


public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public Integer getReviewsno() {
	return reviewsno;
}
public void setReviewsno(Integer reviewsno) {
	this.reviewsno = reviewsno;
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
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getReviewdate() {
	return reviewdate;
}
public void setReviewdate(String reviewdate) {
	this.reviewdate = reviewdate;
}


  
}