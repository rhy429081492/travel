package com.njust.travel.service.impl;

import com.njust.travel.dao.AgencyDao;
import com.njust.travel.dao.BusinessDao;
import com.njust.travel.dao.OrderDao;
import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Order;
import com.njust.travel.service.AgencyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "agencyService")
public class AgencyServiceImpl implements AgencyService {
    @Resource(name = "agencyDao")
    private AgencyDao agencyDao;
    @Resource(name = "businessDao")
    private BusinessDao businessDao;
    @Resource(name = "orderDao")
    private OrderDao orderDao;
    @Override
    public boolean login(String username, String password) {
        List<Agency> agencies = agencyDao.findAll();
        for (Agency agency:agencies
             ) {
            System.out.println(agency.getUsername()+":"+agency.getPassword()+":"+agency.getStatus());
            if (username.equals(agency.getUsername())&&password.equals(agency.getPassword())&&agency.getStatus()){
                return true;
            }
        }
        return false;
    }

    @Override
    public void register(Agency agency) {
        agency.setStatus(false);
        agencyDao.saveAndFlush(agency);
    }

    @Override
    public List<Business> getBusiness(String username) {
        Integer agencyId=-1;
        List<Business> businesses = new ArrayList<Business>();
        for (Agency agency :agencyDao.findAll()
                ) {
            if (username.equals(agency.getUsername())){
                agencyId = agency.getId();
                break;
            }
        }
        for (Business business:businessDao.findAll()
             ) {
            if (agencyId.equals(business.getAgencyid())){
                businesses.add(business);
            }
        }
        return businesses;
    }

    @Override
    public void saveBusiness(Business business) {
        businessDao.saveAndFlush(business);
    }

    @Override
    public void deleteBusiness(Integer id) {
        businessDao.deleteById(id);
    }

    @Override
    public List<Order> getOrder(Integer businessId) {
        List<Order> orders = new ArrayList<Order>();
        for (Order order:orderDao.findAll()
             ) {
            if (businessId.equals(order.getId())){
                orders.add(order);
            }
        }
        return orders;
    }
}
