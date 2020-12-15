package com.ipc.userservice.user.service;

import com.ipc.userservice.user.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PurchaseService {

	/* To Add Course Details To Summary */
	String addCourseToPurchaseSummary(String userId, PurchaseCartDto purchaseCartDto);

	/* To Get Added Course Details To Summary */
	List<SubjectSpecific> getAddedCourseDetailsToSummary(String userId);;

	/* To Remove Course Records From Summary */
	String removeCourseRecordsFromSummary(String userId, PurchaseCartDto purchaseCartDto);

	/* To allow Student to confirm the purchase details */
	String confirmPurchase(String userId, ApprovalStatusDto approvalStatusDto);

	List<ConfirmApprovalDto> getConfirmApprovalStatus(String userId);

	/* To check whether user already purchased the course  */
	String checksPurchasedAlready(String userId, PurchaseCartDto purchaseCartDto);



}
