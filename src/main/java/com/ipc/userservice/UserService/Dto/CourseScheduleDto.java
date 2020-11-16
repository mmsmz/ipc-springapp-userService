package com.ipc.userservice.UserService.Dto;

public class CourseScheduleDto {

    private Integer coursePriceId;
    private String day;
    private String time;


    public Integer getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(Integer coursePriceId) {
        this.coursePriceId = coursePriceId;
    }

}
