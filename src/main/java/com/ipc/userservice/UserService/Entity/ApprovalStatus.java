package com.ipc.userservice.UserService.Entity;

import javax.persistence.*;

@Entity
@Table(name = "approvalstatus")
public class ApprovalStatus {

    @Id
    @Column(name = "apvlstatid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer approvalStatusId;
    
    @Column(name = "studpurid")
    private Integer studentPurchaseID;

    @Column(name = "approvalstatus")
    private String approvalStatus;

    @Column(name = "passcode")
    private String passcode;

    @Column(name = "comments")
    private String comments;

    public Integer getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(Integer approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }

    public Integer getStudentPurchaseID() {
        return studentPurchaseID;
    }

    public void setStudentPurchaseID(Integer studentPurchaseID) {
        this.studentPurchaseID = studentPurchaseID;
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
