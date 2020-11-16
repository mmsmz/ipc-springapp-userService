package com.ipc.userservice.UserService.Dto;

import java.time.Instant;

public class CoursePriceDto {

    private String subjectName;
    private String subjectCategory;
    private double price;

    @Override
    public String toString() {
        return "CoursePriceDto{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectCategory='" + subjectCategory + '\'' +
                ", price=" + price +
                '}';
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(String subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
