package com.njust.travel.service;

import com.njust.travel.entity.Business;
import com.njust.travel.entity.Order;
import com.njust.travel.entity.Vip;

import java.util.List;

public interface VipService {
    public boolean login(String username, String password);
    public void register(Vip vip);
    public List<Business> getBusiness();//获取所有业务
    public List<Order> getOrder(String username);//获取自己的订单
    public void saveOrder(Order order);//修改订单
}
