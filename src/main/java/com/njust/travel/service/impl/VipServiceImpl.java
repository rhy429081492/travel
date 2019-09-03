package com.njust.travel.service.impl;

import com.njust.travel.dao.BusinessDao;
import com.njust.travel.dao.OrderDao;
import com.njust.travel.dao.VipDao;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Order;
import com.njust.travel.entity.Vip;
import com.njust.travel.service.VipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "vipService")
public class VipServiceImpl implements VipService {
    @Resource(name = "vipDao")
    private VipDao vipDao;
    @Resource(name = "businessDao")
    private BusinessDao businessDao;
    @Resource(name = "orderDao")
    private OrderDao orderDao;
    @Override
    public boolean login(String username, String password) {
        List<Vip> vips = vipDao.findAll();
        for (Vip vip:vips
             ) {
            if (username.equals(vip.getUsername())&&password.equals(vip.getPassword())&&vip.getStatus()){
                return true;
            }
        }
        return false;
    }

    @Override
    public void register(Vip vip) {
        vip.setStatus(false);
        vipDao.save(vip);
    }

    @Override
    public List<Business> getBusiness() {
        return businessDao.findAll();
    }

    @Override
    public List<Order> getOrder(String username) {
        Integer vipId=-1;
        List<Order> orders = new ArrayList<Order>();
        for (Vip vip:vipDao.findAll()
             ) {
            if (username.equals(vip.getUsername())){
                vipId = vip.getId();
                break;
            }
        }
        for (Order order:orderDao.findAll()
             ) {
            if (vipId.equals(order.getVipid())){
                orders.add(order);
            }
        }
        return orders;
    }

    @Override
    public void saveOrder(Order order) {
        orderDao.saveAndFlush(order);
    }
}
