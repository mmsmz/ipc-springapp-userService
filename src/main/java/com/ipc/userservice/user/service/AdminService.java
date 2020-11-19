package com.ipc.userservice.user.service;

import com.ipc.userservice.user.dto.CoursePriceDto;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    // To Add Course & Price Details
    String addCoursePriceDetails(CoursePriceDto coursePriceDto);
}
