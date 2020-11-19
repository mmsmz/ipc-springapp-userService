package com.ipc.userservice.user.repository;

import com.ipc.userservice.user.entity.CoursePriceEntity;
import com.ipc.userservice.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursePriceRepository extends JpaRepository<CoursePriceEntity, String> {

}