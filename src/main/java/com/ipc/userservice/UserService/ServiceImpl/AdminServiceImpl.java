package com.ipc.userservice.UserService.ServiceImpl;

import com.ipc.userservice.Repository.AdminRepository;
import com.ipc.userservice.Repository.PurchaseRepository;
import com.ipc.userservice.UserService.Controller.AdminController;
import com.ipc.userservice.UserService.Controller.PurchaseController;
import com.ipc.userservice.UserService.Service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableJpaRepositories("com.ipc.userService.Repository")
public class AdminServiceImpl implements AdminService {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    AdminRepository adminRepository;



}
