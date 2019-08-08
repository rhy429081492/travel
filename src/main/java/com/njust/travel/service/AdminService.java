package com.njust.travel.service;

import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Vip;

import java.util.List;

public interface AdminService {
    public boolean login(String username, String password);//登录
    public List<Vip> getVip();//读取待审核用户
    public void saveVip(Integer id);//用户通过审核
    public void deleteVip(Integer id);//用户审核不通过
    public List<Agency> getAgency();//读取待审核旅行社
    public void saveAgency(Integer id);//用户通过审核
    public void deleteAgency(Integer id);//用户审核不通过
    public List<Business> getBusiness();//读取所有业务
    public void deleteBusiness(Integer id);//删除不合格业务
}
