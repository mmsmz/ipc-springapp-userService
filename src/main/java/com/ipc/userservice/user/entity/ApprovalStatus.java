package com.ipc.userservice.user.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "approvalstatus")
public class ApprovalStatus {

    @Id
    @GenericGenerator(name = "sequence_apvlstatid_id", strategy = "com.ipc.userservice.user.util.generateid.ApprovalStatusIdGenerator")
    @GeneratedValue(generator = "sequence_apvlstatid_id")
    @Column(name = "apvlstatid")
    private String approvalStatusId;
    
    @Column(name = "studpurid")
    private String studentPurchaseID;

    @Column(name = "approvalstatus")
    private String approvalStatus;

    @Column(name = "passcode")
    private String passcode;

    @Column(name = "comments")
    private String comments;

    public String getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(String approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }

    public String getStudentPurchaseID() {
        return studentPurchaseID;
    }

    public void setStudentPurchaseID(String studentPurchaseID) {
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
