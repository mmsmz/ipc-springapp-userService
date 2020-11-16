package com.ipc.userservice.UserService.Entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "studentpurchase")
public class StudentPurchaseEntity {

    @Id
    @Column(name = "studpurchId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentPurchaseId;

    @Column(name = "userid")
    private String userId;

    @Column(name = "crsprid")
    private String coursePriceId;

    @Column(name = "crsshedid")
    private String courseScheduleId;

    @Column(name = "paymenttype")
    private String paymentType;

    @Column(name = "receiptimagelocation")
    private String receiptImageLocation;

    @Column(name = "difftypeofbank")
    private String diffTypeOfBank;

    @Column(name = "date")
    private Instant date;

}
