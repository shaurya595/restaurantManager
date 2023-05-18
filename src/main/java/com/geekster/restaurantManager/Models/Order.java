package com.geekster.restaurantManager.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @ManyToOne(cascade = CascadeType.ALL)
    private FoodItem foodItem;
    private Integer quantity;
    private String status;
    private Integer productCountNumber;


}
