package com.ipc.userservice.user.service.serviceImpl;

import com.ipc.userservice.user.dto.CoursePriceDto;
import com.ipc.userservice.user.entity.CoursePriceEntity;
import com.ipc.userservice.user.repository.AdminRepository;
import com.ipc.userservice.user.service.AdminService;
import com.ipc.userservice.user.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@EnableJpaRepositories("com.ipc.userservice.user.Repository")
public class AdminServiceImpl implements AdminService {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    AdminRepository adminRepository;

    // To Add Course & Price Details
    @Override
    public String addCoursePriceDetails(CoursePriceDto coursePriceDto) {
        try {
            CoursePriceEntity coursePriceEntity = new CoursePriceEntity();
            coursePriceEntity.setSubjectName(coursePriceDto.getSubjectName());
            coursePriceEntity.setSubjectCategory(coursePriceDto.getSubjectCategory());
            coursePriceEntity.setPrice(coursePriceDto.getPrice());
            adminRepository.save(coursePriceEntity);
            return CommonConstant.SUCCESSFULLY_REGISTERED;

        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }


}
