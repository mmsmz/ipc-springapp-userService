package com.ipc.userservice.user.dto;

import java.util.ArrayList;

public class ConfirmApprovalDto extends Subjects {

	public ConfirmApprovalDto(String subjectName, ArrayList<SubjectCategory> subjectCategories, String comments,
			String passcode, String meetingId, String approvalStatus, String approvalStatusId) {
		super(subjectName, subjectCategories);
		this.comments = comments;
		this.passcode = passcode;
		this.meetingId = meetingId;
		this.approvalStatus = approvalStatus;
		this.approvalStatusId = approvalStatusId;
	}

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
