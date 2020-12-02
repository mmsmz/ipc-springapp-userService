package com.ipc.userservice.user.dto;

public class CourseSchedule {
	private String CourseSchedulrId;
	private String Schedule;

	public String getCourseSchedulrId() {
		return CourseSchedulrId;
	}

	public void setCourseSchedulrId(String courseSchedulrId) {
		CourseSchedulrId = courseSchedulrId;
	}

	public CourseSchedule(String courseSchedulrId, String schedule) {
		CourseSchedulrId = courseSchedulrId;
		Schedule = schedule;
	}

	public String getSchedule() {
		return Schedule;
	}

	public void setSchedule(String schedule) {
		Schedule = schedule;
	}
}
