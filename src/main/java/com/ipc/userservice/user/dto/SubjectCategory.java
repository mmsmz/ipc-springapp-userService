package com.ipc.userservice.user.dto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubjectCategory {

    private String subjectCategory;
    private double price;
    private ArrayList<String> schedule;

    public ArrayList<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<String> schedule) {
        this.schedule = schedule;
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
