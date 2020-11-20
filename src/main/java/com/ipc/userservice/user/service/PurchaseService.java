package com.ipc.userservice.user.service;

import com.ipc.userservice.user.dto.CoursePriceDto;
import com.ipc.userservice.user.dto.StudentPurchaseDto;
import com.ipc.userservice.user.dto.Subjects;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PurchaseService {

    /* To Get All Menu Options To Purchase Cart Page */
    List<Subjects>  getAllMenuOptionsToPage();

    /* To Add Course Details To Summary */
    String addCourseDetailsToSummary(StudentPurchaseDto studentPurDto);

    /* To Remove Course Records From Summary */
    String removeCourseRecordsFromSummary(StudentPurchaseDto studentPurDto);

    /* To Get Purchased Course Details To Summary Table */
    String getPurchasedCourseDetailsToSummary(StudentPurchaseDto studentPurDto);

    /* To allow Student to confirm the purchase details */
    String confirmPurchase(StudentPurchaseDto studentPurchaseDto);

}
