package com.ipc.userservice.user.dto;

public class CoursePriceDto {

    private String subjectName;
    private String subjectCategory;
    private double price;
    public CoursePriceDto(){

    }

    public CoursePriceDto(String subjectName, String subjectCategory, double price) {
        this.subjectName = subjectName;
        this.subjectCategory = subjectCategory;
        this.price = price;
    }

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
