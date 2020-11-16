package com.ipc.userservice.UserService.Entity;

import javax.persistence.*;

@Entity
@Table(name = "courseschedule")
public class CourseScheduleEntity {

    @Id
    @Column(name = "crsshedid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseScheduleId;

    @Column(name = "crsprid")
    private String subjectName;

    @Column(name = "day")
    private String day;

    @Column(name = "time")
    private String time;

    public Integer getCourseScheduleId() {
        return courseScheduleId;
    }

    public void setCourseScheduleId(Integer courseScheduleId) {
        this.courseScheduleId = courseScheduleId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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
}
