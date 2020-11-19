package com.ipc.userservice.user.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "studentpurchase")
public class StudentPurchaseEntity {

    @Id
    @Column(name = "studpurid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentPurchaseId;

    @Column(name = "userid")
    private Integer userId;

    @Column(name = "crsprid")
    private Integer coursePriceId;

    @Column(name = "crsschedid")
    private Integer courseScheduleId;

    @Column(name = "paymenttype")
    private String paymentType;

    @Column(name = "receiptimagelocation")
    private String receiptImageLocation;

    @Column(name = "amountdeposited")
    private double amountDeposited;

    @Column(name = "difftypeofbank")
    private String diffTypeOfBank;

    @Column(name = "date")
    private Instant date;

    public Integer getStudentPurchaseId() {
        return studentPurchaseId;
    }

    public void setStudentPurchaseId(Integer studentPurchaseId) {
        this.studentPurchaseId = studentPurchaseId;
    }

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
