package com.ipc.userservice.user.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "studentpurchase")
public class StudentPurchaseEntity {

    @Id
    @GenericGenerator(name = "sequence_studpurid_id", strategy = "com.ipc.userservice.user.util.generateid.StudentPurchaseIdGenerator")
    @GeneratedValue(generator = "sequence_studpurid_id")
    @Column(name = "studpurid")
    private String studentPurchaseId;

    @Column(name = "userid")
    private String userId;

    @Column(name = "crsprid")
    private String coursePriceId;

    @Column(name = "crsschedid")
    private String courseScheduleId;

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

    public String getStudentPurchaseId() {
        return studentPurchaseId;
    }

    public void setStudentPurchaseId(String studentPurchaseId) {
        this.studentPurchaseId = studentPurchaseId;
    }

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
