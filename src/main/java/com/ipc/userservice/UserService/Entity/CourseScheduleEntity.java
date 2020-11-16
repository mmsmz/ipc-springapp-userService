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
}
