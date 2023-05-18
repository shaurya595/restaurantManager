package com.geekster.restaurantManager.Service;

import com.geekster.restaurantManager.Models.Order;
import com.geekster.restaurantManager.Repository.IAddressRepo;
import com.geekster.restaurantManager.Repository.IOrderRepo;
import com.geekster.restaurantManager.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;
    @Autowired
    IAddressRepo iAddressRepo;

    @Autowired
    IUserRepo iUserRepo;


    public void createOrder(Order myOrder) {

    }
}
