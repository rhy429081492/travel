package com.njust.travel.service;

import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Order;

import java.util.List;

public interface AgencyService {
    public boolean login(String username, String password);
    public void register(Agency agency);
    public List<Business> getBusiness(String username);//获取本旅行社所有业务
    public void saveBusiness(Business business);//保存或更新旅行社业务
    public void deleteBusiness(Integer id);///删除本旅行社业务
    public List<Order> getOrder(Integer businessId);//查询某一业务的所有订单
}
