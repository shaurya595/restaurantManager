package com.geekster.restaurantManager.Repository;

import com.geekster.restaurantManager.Models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
