package com.ipc.userservice.user.service;

import com.ipc.userservice.user.dto.ApprovalStatusDto;
import com.ipc.userservice.user.dto.CoursePriceDto;
import com.ipc.userservice.user.dto.PurchaseCartDto;
import com.ipc.userservice.user.dto.StudentPurchaseDto;
import com.ipc.userservice.user.dto.Subjects;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PurchaseService {

    /* To Add Course Details To Summary */
    String addCourseToPurchaseSummary(String userId, PurchaseCartDto purchaseCartDto);

    /* To Get Added Course Details To Summary */
    List<Subjects> getAddedCourseDetailsToSummary(String userId);
;
    /* To Remove Course Records From Summary */
    String removeCourseRecordsFromSummary(String userId, PurchaseCartDto purchaseCartDto);

    /* To allow Student to confirm the purchase details */
    String confirmPurchase(String userId,ApprovalStatusDto approvalStatusDto);

    String getConfirmApprovalStatus(String userId,PurchaseCartDto approvalStatusDto);


}
