package io.spring.users.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.spring.users.entity.userEntity;
import io.spring.users.service.usersService;

@RestController
public class userController {

    @Autowired
    private usersService usersService;

    @GetMapping("/allUsers")
    public ResponseEntity index(Model model) {
        try {
            List<userEntity> user = usersService.getAllusers();
            model.addAttribute(null, model);
            return ResponseEntity.ok(usersService.getAllusers());

        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    // /**
    //  * @param userName
    //  * @param password
    //  * @return
    //  */
    @PostMapping("/addUsers")
    public String addUsers(
            @RequestParam(name = "username", defaultValue = "No name") String userName,
            @RequestParam(name = "password") String password) {
        try {
            usersService.addUserEntity(new userEntity(0, "userName", "password"));
            // userRepositore.saveAll(userName);
            return ("успешно сохранено");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return userName;

    }
}
