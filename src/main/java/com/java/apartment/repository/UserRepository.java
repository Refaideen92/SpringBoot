package com.java.apartment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.apartment.modal.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
