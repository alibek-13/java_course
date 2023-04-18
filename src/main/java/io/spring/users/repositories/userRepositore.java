package io.spring.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.spring.users.entity.userEntity;


@Transactional
public interface userRepositore extends JpaRepository<userEntity, Long> {
    
}
