package com.ipc.userservice.user.dto;

import java.util.ArrayList;

/**
 * To get ALl Course Details API To get all subjectCategory, schedule, price
 * based on the subjectType
 */
public class SubjectCategory {

	public SubjectCategory() {
	}

	private String coursePriceId;
	private String subjectCategory;

	private double price;
	private ArrayList<CourseSchedule> schedule;

	public String getCoursePriceId() {
		return coursePriceId;
	}

	public SubjectCategory(String coursePriceId, String subjectCategory, double price,
			ArrayList<CourseSchedule> schedule) {
		this.coursePriceId = coursePriceId;
		this.subjectCategory = subjectCategory;
		this.price = price;
		this.schedule = schedule;
	}

	public void setCoursePriceId(String coursePriceId) {
		this.coursePriceId = coursePriceId;
	}

	public ArrayList<CourseSchedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(ArrayList<CourseSchedule> schedule) {
		this.schedule = schedule;
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
}
