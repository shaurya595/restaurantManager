package com.geekster.restaurantManager.Controller;

import com.geekster.restaurantManager.Models.Address;
import com.geekster.restaurantManager.Models.User;
import com.geekster.restaurantManager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

}
