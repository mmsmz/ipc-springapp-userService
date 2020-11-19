package com.ipc.userservice.user.Dto;

public class ApprovalStatusDto {

    private Integer coursePriceId;
    private String approvalStatus;
    private String passcode;
    private String comments;

    @Override
    public String toString() {
        return "ApprovalStatusDto{" +
                "coursePriceId=" + coursePriceId +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", passcode='" + passcode + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    public Integer getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(Integer coursePriceId) {
        this.coursePriceId = coursePriceId;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
