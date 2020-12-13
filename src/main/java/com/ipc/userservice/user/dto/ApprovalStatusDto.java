package com.ipc.userservice.user.dto;

public class ApprovalStatusDto {

    private String paymentType;
    private String receiptImgLocation;
    private double amountDeposited;
    private String depositedBank;
    private String approvalStatus;

    public ApprovalStatusDto(String paymentType, String receiptImgLocation, double amountDeposited, String depositedBank, String approvalStatus) {
        this.paymentType = paymentType;
        this.receiptImgLocation = receiptImgLocation;
        this.amountDeposited = amountDeposited;
        this.depositedBank = depositedBank;
        this.approvalStatus = approvalStatus;
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

}
