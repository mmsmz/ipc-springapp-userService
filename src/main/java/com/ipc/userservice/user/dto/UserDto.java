package com.ipc.userservice.user.dto;

public class UserDto {

    private String firstName;
    private String lastName;
    private String nicNr;
    private String email;
    private String mobile;
    private String institutebranch;
    private String deliveryaddress;
    private String password;
    private byte loginStatus;

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

    public String getNicNr() {
        return nicNr;
    }

    public void setNicNr(String nicNr) {
        this.nicNr = nicNr;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(byte loginStatus) {
        this.loginStatus = loginStatus;
    }
}
