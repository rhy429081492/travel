package com.njust.travel.service.impl;

import com.njust.travel.dao.BusinessDao;
import com.njust.travel.entity.Business;
import com.njust.travel.service.OrdinaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "ordinaryService")
public class OrdinaryServiceImpl implements OrdinaryService {
    @Resource(name = "businessDao")
    private BusinessDao businessDao;
    @Override
    public List<Business> getBusiness() {
        return businessDao.findAll();
    }
}
