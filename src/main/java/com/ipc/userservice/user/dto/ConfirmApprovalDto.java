package com.ipc.userservice.user.dto;

public class ConfirmApprovalDto extends Subjects{

    String comments;
    String passcode;
    String meetingId;
    String approvalStatus;
    String approvalStatusId;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(String approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }



}
