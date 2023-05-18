package com.geekster.restaurantManager.Models;

import com.geekster.restaurantManager.Repository.IUserRepo;
import com.geekster.restaurantManager.Service.UserService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
    @Autowired
    IUserRepo userRepo;
    @Autowired
    UserService userService;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserId;
    private String username;
    private String password;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addressList;
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Integer id)
    {
        return userService.getUserById(id);
    }
}
