package com.njust.travel.controller;

import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Vip;
import com.njust.travel.service.AdminService;
import com.njust.travel.service.AgencyService;
import com.njust.travel.service.OrdinaryService;
import com.njust.travel.service.VipService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource(name = "adminService")
    private AdminService adminService;
    @Resource(name = "vipService")
    private VipService vipService;
    @Resource(name = "agencyService")
    private AgencyService agencyService;
    @Resource(name = "ordinaryService")
    private OrdinaryService ordinaryService;

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public ModelAndView adminLogin(@RequestParam("username")String username,
                                   @RequestParam("password")String password){
        boolean flag = adminService.login(username, password);
        ModelAndView mav = new ModelAndView();
        if (flag){
            mav.setViewName("index");
            mav.addObject("user", username);
        }else {
            mav.setViewName("error");
        }
        return mav;
    }//管理员登录

    @RequestMapping(value = "/admin/getVip", method = RequestMethod.POST)
    public String adminGetVip(){
        String str="";
        for (Vip vip:adminService.getVip()
             ) {
            str+=vip.toString()+"/n";
        }
        return str;
    }//管理员获取待审核用户

    @RequestMapping(value = "/admin/saveVip", method = RequestMethod.POST)
    public void adminSaveVip(@RequestParam("id")Integer id){
        adminService.saveVip(id);
    }//管理员审核通过用户

    @RequestMapping(value = "/admin/deleteVip", method = RequestMethod.POST)
    public void adminDeleteVip(@RequestParam("id")Integer id){
        adminService.deleteVip(id);
    }//管理员审核不通过用户

    @RequestMapping(value = "/admin/getAgency",method = RequestMethod.POST)
    public String adminGetAgency(){
        String str="";
        for (Agency agency:adminService.getAgency()
        ) {
            str+=agency.toString()+"/n";
        }
        return str;
    }//管理员获取待审核旅行社

    @RequestMapping(value = "/admin/saveAgency", method = RequestMethod.POST)
    public void adminSaveAgency(@RequestParam("id")Integer id){
        adminService.saveAgency(id);
    }//管理员审核通过旅行社

    @RequestMapping(value = "/admin/deleteAgency", method = RequestMethod.POST)
    public void adminDeleteAgency(@RequestParam("id")Integer id){
        adminService.deleteAgency(id);
    }//管理员审核不通过旅行社

    @RequestMapping(value = "/admin/getBusiness",method = RequestMethod.POST)
    public String adminGetBusiness(){
        String str="";
        for (Business business: adminService.getBusiness()
        ) {
            str+=business.toString()+"/n";
        }
        return str;
    }//管理员获取所以业务

    @RequestMapping(value = "/admin/deleteBusiness", method = RequestMethod.POST)
    public void adminDeleteBusiness(@RequestParam("id")Integer id){
        adminService.deleteBusiness(id);
    }//管理员删除非法业务

    @RequestMapping(value = "/vip/login", method = RequestMethod.POST)
    public boolean vipLogin(@RequestParam("username")String username,
                            @RequestParam("password")String password){
        return vipService.login(username, password);
    }//会员登录

    @RequestMapping(value = "/vip/register", method = RequestMethod.POST)
    public void vipLogin(@RequestParam("username")String username,
                         @RequestParam("password")String password,
                         @RequestParam("age")Integer age,
                         @RequestParam("name")String name,
                         @RequestParam("sex")String sex,
                         @RequestParam("cid")String cid,
                         @RequestParam("tel")String tel,
                         @RequestParam("email")String email){
        Vip vip = new Vip();
        vip.setUsername(username);
        vip.setPassword(password);
        vip.setAge(age);
        vip.setName(name);
        vip.setSex(sex);
        vip.setCid(cid);
        vip.setTel(tel);
        vip.setEmail(email);
        vipService.register(vip);
    }//会员注册

    @RequestMapping(value = "/agency/login", method = RequestMethod.POST)
    public boolean agencyLogin(@RequestParam("username")String username,
                               @RequestParam("password")String password){
        return  agencyService.login(username, password);
    }

    @RequestMapping(value = "/getBusiness", method = RequestMethod.POST)
    public String ordinaryGetScenic(){
        String str="";
        for (Business business:ordinaryService.getBusiness()
             ) {
            str+=business.toString()+"/n";
        }
        return str;
    }
}
