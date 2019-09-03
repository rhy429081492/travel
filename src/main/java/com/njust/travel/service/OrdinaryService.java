package com.njust.travel.service;


import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Order;
import com.njust.travel.entity.Vip;

import java.util.List;

public interface OrdinaryService {
    public List<Business> getBusiness();
    public List<Vip> getVip();
    public void updateVip(Vip vip);
    public List<Agency> getAgency();
    public void updateAgency(Agency agency);
    public List<Order> getOrder();
}
