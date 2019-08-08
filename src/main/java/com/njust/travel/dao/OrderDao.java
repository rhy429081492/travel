package com.njust.travel.dao;

import com.njust.travel.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "orderDao")
public interface OrderDao extends JpaRepository<Order,Integer> {
}
