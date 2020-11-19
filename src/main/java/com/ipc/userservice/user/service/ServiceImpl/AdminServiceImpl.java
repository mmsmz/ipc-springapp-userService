package com.ipc.userservice.user.service.ServiceImpl;

import com.ipc.userservice.user.controller.AdminController;
import com.ipc.userservice.user.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
//@EnableJpaRepositories("com.ipc.userservice.user.Repository")
public class AdminServiceImpl implements AdminService {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(AdminController.class);

// @Autowired
// AdminRepository adminRepository;

}
