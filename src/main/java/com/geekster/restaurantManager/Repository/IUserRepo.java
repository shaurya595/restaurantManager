package com.geekster.restaurantManager.Repository;

import com.geekster.restaurantManager.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
