package com.ipc.userservice.user.Dto;

import java.time.Instant;

public class StudentPurchaseDto {

    private Integer userId;

    private Integer coursePriceId;

    private Integer courseScheduleId;

    private String paymentType;

    private String receiptImageLocation;

    private double amountDeposited;

    private String diffTypeOfBank;

    private Instant date;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(Integer coursePriceId) {
        this.coursePriceId = coursePriceId;
    }

    public Integer getCourseScheduleId() {
        return courseScheduleId;
    }

    public void setCourseScheduleId(Integer courseScheduleId) {
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
