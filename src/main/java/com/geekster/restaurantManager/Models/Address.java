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
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String landmark;
    private String district;
    private String locality;
    private String zipCode;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;


}
