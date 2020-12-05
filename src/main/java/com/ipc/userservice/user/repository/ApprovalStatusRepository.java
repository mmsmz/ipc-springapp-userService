package com.ipc.userservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipc.userservice.user.entity.ApprovalStatusEntity;

public interface ApprovalStatusRepository extends JpaRepository<ApprovalStatusEntity,String>{

}
