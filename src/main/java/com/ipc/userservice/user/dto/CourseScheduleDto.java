package com.ipc.userservice.user.dto;

import javax.persistence.Column;

public class CourseScheduleDto {

    private String courseScheduleId;
    private String coursePriceId;
    private String day;
    private String time;
    private String passCode;
    private String meetingId;
    private String lecturerName;

    public CourseScheduleDto(String courseScheduleId, String coursePriceId, String day, String time, String passCode, String meetingId, String lecturerName) {
        this.courseScheduleId = courseScheduleId;
        this.coursePriceId = coursePriceId;
        this.day = day;
        this.time = time;
        this.passCode = passCode;
        this.meetingId = meetingId;
        this.lecturerName = lecturerName;
    }

    @Override
    public String toString() {
        return "CourseScheduleDto{" +
                "courseScheduleId='" + courseScheduleId + '\'' +
                ", coursePriceId='" + coursePriceId + '\'' +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", passCode='" + passCode + '\'' +
                ", meetingId='" + meetingId + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                '}';
    }

    public String getCourseScheduleId() {
        return courseScheduleId;
    }

    public void setCourseScheduleId(String courseScheduleId) {
        this.courseScheduleId = courseScheduleId;
    }

    public String getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(String coursePriceId) {
        this.coursePriceId = coursePriceId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
}
