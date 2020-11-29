package com.ipc.userservice.user.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "courseschedule")
public class CourseScheduleEntity {

    @Id
    @GenericGenerator(name = "sequence_crsschedid_id", strategy = "com.ipc.userservice.user.util.generateid.CourseScheduleIdGenerator")
    @GeneratedValue(generator = "sequence_crsschedid_id")
    @Column(name = "crsschedid")
    private String courseScheduleId;

    @Column(name = "crsprid")
    private String crsprid;

	@Column(name = "day")
    private String day;

    @Column(name = "time")
    private String time;

    @Column(name = "passcode")
    private String passCode;

    @Column(name = "meetingid")
    private String meetingId;

    @Column(name = "lecturername")
    private String 	lecturerName;


    public String getCourseScheduleId() {
        return courseScheduleId;
    }

    public void setCourseScheduleId(String courseScheduleId) {
        this.courseScheduleId = courseScheduleId;
    }

    public String getCrsprid() {
        return crsprid;
    }

    public void setCrsprid(String crsprid) {
        this.crsprid = crsprid;
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
