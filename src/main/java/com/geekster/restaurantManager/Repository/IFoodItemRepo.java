package com.geekster.restaurantManager.Repository;

import com.geekster.restaurantManager.Models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem,Integer> {
}
