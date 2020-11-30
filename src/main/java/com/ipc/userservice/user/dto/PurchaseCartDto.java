package com.ipc.userservice.user.dto;

public class PurchaseCartDto {

    private String coursePriceId;

    private String courseScheduleId;

    public PurchaseCartDto(String coursePriceId, String courseScheduleId) {
        this.coursePriceId = coursePriceId;
        this.courseScheduleId = courseScheduleId;
    }

    @Override
    public String toString() {
        return "StudentPurchaseDto{" +
                ", coursePriceId='" + coursePriceId + '\'' +
                ", courseScheduleId='" + courseScheduleId + '\'' +
                '}';
    }

    public String getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(String coursePriceId) {
        this.coursePriceId = coursePriceId;
    }

    public String getCourseScheduleId() {
        return courseScheduleId;
    }

    public void setCourseScheduleId(String courseScheduleId) {
        this.courseScheduleId = courseScheduleId;
    }

}
