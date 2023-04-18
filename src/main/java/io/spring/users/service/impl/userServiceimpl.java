package io.spring.users.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.users.entity.userEntity;
import io.spring.users.repositories.userRepositore;
import io.spring.users.service.usersService;

@Service
public class userServiceimpl implements usersService {

    @Autowired
    private userRepositore userRepositore;

    @Override
    public userEntity addUserEntity(userEntity user) {

        try {
            return userRepositore.save(user);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'addUserEntity'");
        }

    }

    @Override
    public List<userEntity> getAllusers() {
        try {
            return userRepositore.findAll();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'addUserEntity'");
        }
    }

    @Override
    public userEntity getUsers(long id) {
        try {
            return userRepositore.getOne(id);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'addUserEntity'");
        }
    }
    @Override
    public void deleteUsers(userEntity user) {
        try {
            userRepositore.delete(user);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'addUserEntity'");
        }
    }
    @Override
    public userEntity saveUser(userEntity user) {

        try {
            return userRepositore.save(user);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'addUserEntity'");
        }

    }

}
