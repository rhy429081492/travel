package com.njust.travel.service.impl;

import com.njust.travel.dao.AdminDao;
import com.njust.travel.dao.AgencyDao;
import com.njust.travel.dao.BusinessDao;
import com.njust.travel.dao.VipDao;
import com.njust.travel.entity.Admin;
import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Vip;
import com.njust.travel.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {

    @Resource(name = "adminDao")
    private AdminDao adminDao;
    @Resource(name = "vipDao")
    private VipDao vipDao;
    @Resource(name = "agencyDao")
    private AgencyDao agencyDao;
    @Resource(name = "businessDao")
    private BusinessDao businessDao;

    @Override
    public boolean login(String username, String password) {
        List<Admin> admins = adminDao.findAll();
        for (Admin admin:admins
             ) {
            if (username.equals(admin.getUsername())&&password.equals(admin.getPassword())){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Vip> getVip() {
        List<Vip> list = new ArrayList<Vip>();
        for (Vip vip:vipDao.findAll()
             ) {
            if (!vip.getStatus()){
                list.add(vip);
            }
        }
        return list;
    }

    @Override
    public void saveVip(Integer id) {
        Vip vip = vipDao.getOne(id);
        vip.setStatus(true);
        vipDao.saveAndFlush(vip);
    }

    @Override
    public void deleteVip(Integer id) {
        vipDao.deleteById(id);
    }

    @Override
    public List<Agency> getAgency() {
        List<Agency> list = new ArrayList<Agency>();
        for (Agency agency:agencyDao.findAll()
        ) {
            if (!agency.getStatus()){
                list.add(agency);
            }
        }
        return list;
    }

    @Override
    public void saveAgency(Integer id) {
        Agency agency = agencyDao.getOne(id);
        agency.setStatus(true);
        agencyDao.saveAndFlush(agency);
    }

    @Override
    public void deleteAgency(Integer id) {
        agencyDao.deleteById(id);
    }

    @Override
    public List<Business> getBusiness() {
        return businessDao.findAll();
    }

    @Override
    public void deleteBusiness(Integer id) {
        businessDao.deleteById(id);
    }
}
