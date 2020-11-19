package com.ipc.userservice.user.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "courseprice")
public class CoursePriceEntity {

    @Id
    @GenericGenerator(name = "sequence_crspr_id", strategy = "com.ipc.userservice.user.util.generateid.CoursePriceIdGenerator")
    @GeneratedValue(generator = "sequence_crspr_id")
    @Column(name = "crsprid")
    private String coursePriceId;

    @Column(name = "subjectname")
    private String subjectName;

    @Column(name = "subjectcategory")
    private String subjectCategory;

    @Column(name = "price")
    private double price;

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
