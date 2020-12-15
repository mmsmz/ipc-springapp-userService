package com.ipc.userservice.user.dto;

import java.util.ArrayList;

public class SubjectSpecific {
	private String subjectName;
	private String coursePriceId;
	private String subjectCategory;
	private double price;
	private String courseScheduleId;
	private String schedule;

	public SubjectSpecific() {
	}

	public SubjectSpecific(String subjectName, String coursePriceId, String subjectCategory, double price, String courseScheduleId, String schedule) {
		this.subjectName = subjectName;
		this.coursePriceId = coursePriceId;
		this.subjectCategory = subjectCategory;
		this.price = price;
		this.courseScheduleId = courseScheduleId;
		this.schedule = schedule;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getCoursePriceId() {
		return coursePriceId;
	}

	public void setCoursePriceId(String coursePriceId) {
		this.coursePriceId = coursePriceId;
	}

	public String getSubjectCategory() {
		return subjectCategory;
	}

	public void setSubjectCategory(String subjectCategory) {
		this.subjectCategory = subjectCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourseScheduleId() {
		return courseScheduleId;
	}

	public void setCourseScheduleId(String courseScheduleId) {
		this.courseScheduleId = courseScheduleId;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
}
