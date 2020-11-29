package com.ipc.userservice.user.dto;

public class ApprovalStatusDto {

    private String approvalStatusId;
    private String studentPurchaseId;
    private String paymentType;
    private String receiptImgLocation;
    private double amountDeposited;
    private String depositedBank;
    private String approvalStatus;
    private String comments;


    public String getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(String approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }

    public String getStudentPurchaseId() {
        return studentPurchaseId;
    }

    public void setStudentPurchaseId(String studentPurchaseId) {
        this.studentPurchaseId = studentPurchaseId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getReceiptImgLocation() {
        return receiptImgLocation;
    }

    public void setReceiptImgLocation(String receiptImgLocation) {
        this.receiptImgLocation = receiptImgLocation;
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
}
