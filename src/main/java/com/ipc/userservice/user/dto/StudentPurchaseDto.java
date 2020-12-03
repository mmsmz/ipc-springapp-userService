package com.ipc.userservice.user.dto;

import javax.persistence.Column;
import java.time.Instant;

public class StudentPurchaseDto {

    private String studentPurchaseId;

    private String userId;

    private String coursePriceId;

    private String courseScheduleId;

    private String approvalStatusId;

    public StudentPurchaseDto(){}

    public StudentPurchaseDto(String studentPurchaseId, String userId, String coursePriceId, String courseScheduleId) {
        this.studentPurchaseId = studentPurchaseId;
        this.userId = userId;
        this.coursePriceId = coursePriceId;
        this.courseScheduleId = courseScheduleId;
    }

    public StudentPurchaseDto(String coursePriceId, String courseScheduleId) {
        this.coursePriceId = coursePriceId;
        this.courseScheduleId = courseScheduleId;
    }

    @Override
    public String toString() {
        return "StudentPurchaseDto{" +
                "studentPurchaseId='" + studentPurchaseId + '\'' +
                ", coursePriceId='" + coursePriceId + '\'' +
                ", courseScheduleId='" + courseScheduleId + '\'' +
                ", approvalStatusId='" + approvalStatusId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStudentPurchaseId() {
        return studentPurchaseId;
    }

    public void setStudentPurchaseId(String studentPurchaseId) {
        this.studentPurchaseId = studentPurchaseId;
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

    public String getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(String approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }
}
