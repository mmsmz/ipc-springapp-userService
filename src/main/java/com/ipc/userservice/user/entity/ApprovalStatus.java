package com.ipc.userservice.user.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;

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

    @Column(name = "paymenttype")
    private String paymentType;

    @Column(name = "receiptimagelocation")
    private String receiptImageLocation;

    @Column(name = "amountdeposited")
    private double amountDeposited;

    @Column(name = "depositedbank")
    private String depositedBank;

    @Column(name = "approvalstatus")
    private String approvalStatus;

    @Column(name = "comments")
    private String comments;

    @Column(name = "date")
    private Instant date; // only date


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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getReceiptImageLocation() {
        return receiptImageLocation;
    }

    public void setReceiptImageLocation(String receiptImageLocation) {
        this.receiptImageLocation = receiptImageLocation;
    }

    public double getAmountDeposited() {
        return amountDeposited;
    }

    public void setAmountDeposited(double amountDeposited) {
        this.amountDeposited = amountDeposited;
    }

    public String getDepositedBank() {
        return depositedBank;
    }

    public void setDepositedBank(String depositedBank) {
        this.depositedBank = depositedBank;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

}
