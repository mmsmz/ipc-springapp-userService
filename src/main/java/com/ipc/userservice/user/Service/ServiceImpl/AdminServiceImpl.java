package com.ipc.userservice.user.Service.ServiceImpl;

import com.ipc.userservice.user.Controller.AdminController;
import com.ipc.userservice.user.Service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
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
