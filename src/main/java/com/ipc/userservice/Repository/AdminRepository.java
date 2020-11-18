package com.ipc.userservice.Repository;

import com.ipc.userservice.UserService.Entity.StudentPurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<StudentPurchaseEntity, Long> {

}
