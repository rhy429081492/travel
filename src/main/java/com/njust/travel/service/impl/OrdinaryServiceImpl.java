package com.njust.travel.service.impl;

import com.njust.travel.dao.AgencyDao;
import com.njust.travel.dao.BusinessDao;
import com.njust.travel.dao.OrderDao;
import com.njust.travel.dao.VipDao;
import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Order;
import com.njust.travel.entity.Vip;
import com.njust.travel.service.OrdinaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "ordinaryService")
public class OrdinaryServiceImpl implements OrdinaryService {
    @Resource(name = "businessDao")
    private BusinessDao businessDao;
    @Resource(name = "vipDao")
    private VipDao vipDao;
    @Resource(name = "agencyDao")
    private AgencyDao agencyDao;
    @Resource(name = "orderDao")
    private OrderDao orderDao;
    @Override
    public List<Business> getBusiness() {
        return businessDao.findAll();
    }

    @Override
    public List<Vip> getVip() {
        List<Vip> list = new ArrayList<Vip>();
        for (Vip vip:vipDao.findAll()
             ) {
            if (vip.getStatus()){
                list.add(vip);
            }
        }
        return list;
    }

    @Override
    public void updateVip(Vip vip) {
        vipDao.saveAndFlush(vip);
    }

    @Override
    public List<Agency> getAgency() {
        List<Agency> list = new ArrayList<Agency>();
        for (Agency agency:agencyDao.findAll()
        ) {
            if (agency.getStatus()){
                list.add(agency);
            }
        }
        return list;
    }

    @Override
    public void updateAgency(Agency agency) {
        agencyDao.saveAndFlush(agency);
    }

    @Override
    public List<Order> getOrder() {
        List<Order> list =  orderDao.findAll();
        List<Order> list1 = new ArrayList<Order>();
        for (Order order:list
             ) {
            if (order.getStatus()){
                list1.add(order);
            }
        }
        return list1;
    }
}
