package com.geekster.restaurantManager.Service;

import com.geekster.restaurantManager.Models.User;
import com.geekster.restaurantManager.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public void save(User myUser) {

        iUserRepo.save(myUser);
    }

    public Optional<User> getUserById(Integer id) {
        return iUserRepo.findById(id);
    }
}
