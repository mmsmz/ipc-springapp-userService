package com.ipc.userservice.user.dto;

import java.time.Instant;

public class StudentPurchaseDto {

    private String userId;

    private String coursePriceId;

    private String courseScheduleId;

    private String paymentType;

    private String receiptImageLocation;

    private double amountDeposited;

    private String diffTypeOfBank;

    private Instant date;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getDiffTypeOfBank() {
        return diffTypeOfBank;
    }

    public void setDiffTypeOfBank(String diffTypeOfBank) {
        this.diffTypeOfBank = diffTypeOfBank;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}
