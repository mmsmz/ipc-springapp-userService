package com.ipc.userservice.user.dto;

public class CourseSchedule {
	private String CourseScheduleId;
	private String Schedule;


	public CourseSchedule(String courseScheduleId, String schedule) {
		CourseScheduleId = courseScheduleId;
		Schedule = schedule;
	}

	public String getCourseScheduleId() {
		return CourseScheduleId;
	}

	public void setCourseScheduleId(String courseScheduleId) {
		CourseScheduleId = courseScheduleId;
	}

	public String getSchedule() {
		return Schedule;
	}

	public void setSchedule(String schedule) {
		Schedule = schedule;
	}
}
