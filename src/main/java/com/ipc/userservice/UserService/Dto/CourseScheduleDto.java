package com.ipc.userservice.UserService.Dto;

public class CourseScheduleDto {

    private Integer coursePriceId;
    private String day;
    private String time;

    @Override
    public String toString() {
        return "CourseScheduleDto{" +
                "coursePriceId=" + coursePriceId +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Integer getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(Integer coursePriceId) {
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

}
