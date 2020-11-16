package com.ipc.userservice.UserService.Entity;

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

}
