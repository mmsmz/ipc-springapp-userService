package com.ipc.userservice.UserService.Entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "institutebranch")
    private String institutebranch;

    @Column(name = "deliveryaddress")
    private String deliveryaddress;

    @Column(name = "date")
    private Instant date;

    @Column(name = "usertype")
    private String userType;

    @Column(name = "password")
    private String password;

    @Column(name = "loginstatus")
    private byte loginstatus;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInstitutebranch() {
        return institutebranch;
    }

    public void setInstitutebranch(String institutebranch) {
        this.institutebranch = institutebranch;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(byte loginstatus) {
        this.loginstatus = loginstatus;
    }
}
