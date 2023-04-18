package io.spring.users.service;

import java.util.List;

import io.spring.users.entity.userEntity;

public interface usersService {
    userEntity addUserEntity(userEntity user);
    List<userEntity> getAllusers();
    userEntity getUsers(long id);
    void deleteUsers(userEntity user);
    userEntity saveUser(userEntity user);
}
