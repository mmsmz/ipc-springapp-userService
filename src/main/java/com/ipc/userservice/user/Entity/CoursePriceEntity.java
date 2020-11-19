package com.ipc.userservice.user.Entity;

import javax.persistence.*;

@Entity
@Table(name = "courseprice")
public class CoursePriceEntity {

    @Id
    @Column(name = "crsprid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coursePriceId;

    @Column(name = "subjectname")
    private String subjectName;

    @Column(name = "subjectcategory")
    private String subjectCategory;

    @Column(name = "price")
    private double price;

    public Integer getCoursePriceId() {
        return coursePriceId;
    }

    public void setCoursePriceId(Integer coursePriceId) {
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
