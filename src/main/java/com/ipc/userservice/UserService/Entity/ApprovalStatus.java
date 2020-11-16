package com.ipc.userservice.UserService.Entity;

import javax.persistence.*;

@Entity
@Table(name = "approvalstatus")
public class ApprovalStatus {

    @Id
    @Column(name = "apvlstatid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer approvalStatusId;

    @Column(name = "crsprid")
    private Integer coursePriceId;

    @Column(name = "approvalstatus")
    private String approvalStatus;

    @Column(name = "passcode")
    private String passcode;

    @Column(name = "comments")
    private String comments;



}
