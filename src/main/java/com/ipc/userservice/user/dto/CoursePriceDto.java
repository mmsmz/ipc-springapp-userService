package com.ipc.userservice.user.dto;

public class CoursePriceDto {

    private String coursePriceId;
    private String subjectName;
    private String subjectCategory;
    private double price;

    public CoursePriceDto(){
    }

    public CoursePriceDto(String coursePriceId, String subjectName, String subjectCategory, double price) {
        this.coursePriceId = coursePriceId;
        this.subjectName = subjectName;
        this.subjectCategory = subjectCategory;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoursePriceDto{" +
                "coursePriceId='" + coursePriceId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCategory='" + subjectCategory + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(String coursePriceId) {
        this.coursePriceId = coursePriceId;
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
