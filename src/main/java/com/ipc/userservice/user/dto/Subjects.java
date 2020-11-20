package com.ipc.userservice.user.dto;

import java.util.ArrayList;

public class Subjects {
        private  String subjectName;
        private ArrayList<SubjectCategory> subjectCategories;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ArrayList<SubjectCategory> getSubjectCategories() {
        return subjectCategories;
    }

    public void setSubjectCategories(ArrayList<SubjectCategory> subjectCategories) {
        this.subjectCategories = subjectCategories;
    }
}
