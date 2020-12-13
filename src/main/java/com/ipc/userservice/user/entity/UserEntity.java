package com.ipc.userservice.user.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "userid")
    private String userId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;


    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "institutebranch")
    private String instituteBranch;

    @Column(name = "date")
    private Instant date;

    @Column(name = "usertype")
    private String userType;

    @Column(name = "password")
    private String password;

    @Column(name = "loginstatus")
    private byte loginstatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getInstituteBranch() {
        return instituteBranch;
    }

    public void setInstituteBranch(String instituteBranch) {
        this.instituteBranch = instituteBranch;
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
