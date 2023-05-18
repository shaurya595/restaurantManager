package com.geekster.restaurantManager.Controller;

import com.geekster.restaurantManager.Models.Order;
import com.geekster.restaurantManager.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping()
    ResponseEntity<String> placeOrder(@RequestBody Order myOrder)
    {

        String response;
        HttpStatus status;
        try {
            orderService.createOrder(myOrder);
            response = "Your order of " + myOrder.getProductCountNumber() + " was placed...successfully!!!";
            status = HttpStatus.CREATED;
        }
        catch(Exception e)
        {
            response = "Details passed with your Order are invalid!!!!...Please check and reOrder...";
            status = HttpStatus.BAD_REQUEST;
            System.out.println(e);
        }
        return new ResponseEntity<String>(response,status);


    }
}
