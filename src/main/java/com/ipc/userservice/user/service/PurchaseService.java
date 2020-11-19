package com.ipc.userservice.user.service;

import com.ipc.userservice.user.dto.StudentPurchaseDto;
import org.springframework.stereotype.Service;

@Service
public interface PurchaseService {

    /* To Add Course Details To Summary */
    String addCourseDetailsToSummary(StudentPurchaseDto studentPurDto);

    /* To Remove Course Records From Summary */
    String removeCourseRecordsFromSummary(StudentPurchaseDto studentPurDto);

    /* To Get Purchased Course Details To Summary Table */
    String getPurchasedCourseDetailsToSummary(StudentPurchaseDto studentPurDto);

    /* To Get All Menu Options To Purchase Cart Page */
    String getAllMenuOptionsToPage(StudentPurchaseDto studentPurDto);

    /* To allow Student to confirm the purchase details */
    String confirmPurchase(StudentPurchaseDto studentPurchaseDto);

}
