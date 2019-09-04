package com.njust.travel.controller;

import com.njust.travel.entity.Agency;
import com.njust.travel.entity.Business;
import com.njust.travel.entity.Order;
import com.njust.travel.entity.Vip;
import com.njust.travel.service.AdminService;
import com.njust.travel.service.AgencyService;
import com.njust.travel.service.OrdinaryService;
import com.njust.travel.service.VipService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
                                   @RequestParam("password")String password,
                                   HttpSession httpSession){
        boolean flag = adminService.login(username, password);
        ModelAndView mav = new ModelAndView();
        if (flag){
            mav.setViewName("adminmain");
            httpSession.setAttribute("user", username);
            httpSession.setAttribute("type","admin");
        }else {
            mav.setViewName("loginerror");
        }
        return mav;
    }//管理员登录

    @RequestMapping(value = "/admin/getVip", method = RequestMethod.GET)
    public ModelAndView adminGetVip(){
        ModelAndView mav = new ModelAndView("vipverify");
        mav.addObject("viplist",adminService.getVip());
        return mav;
    }//管理员获取待审核用户

    @RequestMapping(value = "/admin/saveVip", method = RequestMethod.POST)
    public String adminSaveVip(@RequestParam("id")Integer id){
        try{
            adminService.saveVip(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }//管理员审核通过用户

    @RequestMapping(value = "/admin/deleteVip", method = RequestMethod.POST)
    public String adminDeleteVip(@RequestParam("id")Integer id){
        try{
            adminService.deleteVip(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }//管理员审核不通过用户

    @RequestMapping(value = "/admin/getAgency",method = RequestMethod.GET)
    public ModelAndView adminGetAgency(){
        ModelAndView mav = new ModelAndView("agencyverify");
        mav.addObject("agencylist",adminService.getAgency());
        return mav;
    }//管理员获取待审核旅行社

    @RequestMapping(value = "/admin/saveAgency", method = RequestMethod.POST)
    public String adminSaveAgency(@RequestParam("id")Integer id){
        try{
            adminService.saveAgency(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }//管理员审核通过旅行社

    @RequestMapping(value = "/admin/deleteAgency", method = RequestMethod.POST)
    public String adminDeleteAgency(@RequestParam("id")Integer id){
        try{
            adminService.deleteAgency(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
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
    public ModelAndView vipLogin(@RequestParam("username")String username,
                            @RequestParam("password")String password,
                                 HttpSession httpSession){
        List<Business> list = ordinaryService.getBusiness();
        List<Business> list1 = new ArrayList<Business>(6);
        int a,b,c,d,e,f;
        Random ne = new Random();
        a = ne.nextInt(list.size());
        b = ne.nextInt(list.size());
        c = ne.nextInt(list.size());
        d = ne.nextInt(list.size());
        e = ne.nextInt(list.size());
        f = ne.nextInt(list.size());
        list1.add(list.get(a));
        list1.add(list.get(b));
        list1.add(list.get(c));
        list1.add(list.get(d));
        list1.add(list.get(e));
        list1.add(list.get(f));
        boolean flag = vipService.login(username, password);
        if (flag){
            ModelAndView mav = new ModelAndView("main");
            httpSession.setAttribute("user", username);
            httpSession.setAttribute("type","vip");
            httpSession.setAttribute("businesslist",list1);
            return mav;
        } else {
            return new ModelAndView("loginerror");
        }
    }//会员登录

    @RequestMapping(value = "/vip/register", method = RequestMethod.POST)
    public ModelAndView vipRegister(@RequestParam("user")String username,
                         @RequestParam("password")String password,
                         @RequestParam("page")Integer age,
                         @RequestParam("name")String name,
                         @RequestParam("sex")String sex,
                         @RequestParam("pcid")String cid,
                         @RequestParam("ptel")String tel,
                         @RequestParam("pemail")String email){
        try{
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
            return new ModelAndView("registerSuccess");
        }catch (Exception e){
            return new ModelAndView("registerFail");
        }
    }//会员注册
    @RequestMapping(value = "/vip/order", method = RequestMethod.POST)
    public ModelAndView vipOrder(@RequestParam("businessid")Integer id,
                         HttpSession httpSession){
        ModelAndView mav = new ModelAndView();
        try{
            String username = (String) httpSession.getAttribute("user");
            Integer vipid = -1;
            for (Vip vip:ordinaryService.getVip()
            ) {
                if (username.equals(vip.getUsername())){
                    vipid = vip.getId();
                }
            }
            Order order = new Order();
            order.setBusinessid(id);
            order.setVipid(vipid);
            java.util.Date date = new java.util.Date();
            long t = date.getTime();
            java.sql.Date sqldate = new java.sql.Date(t);
            order.setDate(sqldate);
            order.setStatus(false);
            vipService.saveOrder(order);
            for (Business business:ordinaryService.getBusiness()
                 ) {
                if (business.getId() == id){
                    business.setRenop(business.getRenop()-1);
                    agencyService.saveBusiness(business);
                }
            }
            mav.setViewName("ordersuccess");
        } catch (Exception e){
            mav.setViewName("orderfail");
        }
        return mav;
    }
    @RequestMapping(value = "/vip/getOrders", method = RequestMethod.POST)
    public ModelAndView vipGetOrders(HttpSession httpSession){
        ModelAndView mav = new ModelAndView("vipshoworders");
        String username = (String) httpSession.getAttribute("user");
        List<Order> list = vipService.getOrder(username);
        mav.addObject("orderlist",list);
        return mav;
    }
    @RequestMapping(value = "/vip/updateorder", method = RequestMethod.POST)
    public ModelAndView vipUpdateOrder(@RequestParam("orderid")Integer orderid,
                                       @RequestParam("level")Integer level,
                                       @RequestParam("discuss")String discuss){
        ModelAndView mav = new ModelAndView();
        try {
            Order needorder = new Order();
            for (Order order : ordinaryService.getOrder()
            ) {
                if (orderid == order.getId()) {
                    needorder = order;
                }
            }
            needorder.setLevel(level);
            needorder.setDiscuss(discuss);
            vipService.saveOrder(needorder);
            mav.setViewName("updateordersuccess");
        }catch (Exception e){
            e.printStackTrace();
            mav.setViewName("updateorderfail");
        }
        return mav;
    }
    @RequestMapping(value = "/agency/login", method = RequestMethod.POST)
    public ModelAndView agencyLogin(@RequestParam("username")String username,
                               @RequestParam("password")String password,
                                    HttpSession httpSession){
        boolean flag = agencyService.login(username, password);
        if (flag){
            ModelAndView mav = new ModelAndView("agencymain");
            httpSession.setAttribute("user", username);
            httpSession.setAttribute("type","agency");
            return mav;
        } else {
            return new ModelAndView("loginerror");
        }
    }
    @RequestMapping(value = "/agency/register", method = RequestMethod.POST)
    public ModelAndView agencyRegister(@RequestParam("auser")String uername,
                                       @RequestParam("apassword")String password,
                                       @RequestParam("atel")String tel,
                                       @RequestParam("aemail")String email,
                                       @RequestParam("agencyname")String agencyname,
                                       @RequestParam("apname")String name,
                                       @RequestParam("apcid")String cid,
                                       @RequestParam("licence")MultipartFile licence){
        try{
            String filename = licence.getOriginalFilename();
            String path="C:\\Users\\42908\\IdeaProjects\\travel\\src\\main\\webapp\\licence\\";
            File targetFile = new File(path,filename);
            if (!targetFile.exists()){
                targetFile.mkdirs();
            }
            licence.transferTo(targetFile);
            Agency agency = new Agency();
            agency.setUsername(uername);
            agency.setPassword(password);
            agency.setTel(tel);
            agency.setEmail(email);
            agency.setAgencyname(agencyname);
            agency.setName(name);
            agency.setCid(cid);
            agency.setLicencesite(filename);
            agencyService.register(agency);
            return new ModelAndView("registerSuccess");
        } catch (Exception e){
            return new ModelAndView("registerFail");
        }
    }
    @RequestMapping(value = "/agency/updatebusiness", method = RequestMethod.POST)
    public ModelAndView agencyUpdateBusiness(@RequestParam("form-file")MultipartFile[] files,
                                             @RequestParam("form-bname")String bname,
                                             @RequestParam("form-sname")String sname,
                                             @RequestParam("form-begintime") String begintime,
                                             @RequestParam("form-endtime")String endtime,
                                             @RequestParam("form-price")String price,
                                             @RequestParam("form-scale")String scale,
                                             @RequestParam("form-nop")Integer nop,
                                             @RequestParam("form-beginplace")String beginpalce,
                                             @RequestParam("form-vehicle")String vehicle,
                                             @RequestParam("form-introduce")String introduce,
                                             HttpSession httpSession){
        ModelAndView mav = new ModelAndView();
        try{
            Integer agencyId = -1;
            String username = (String) httpSession.getAttribute("user");
            List<Agency> list = ordinaryService.getAgency();
            for (Agency agency:list
                 ) {
                if (username.equals(agency.getUsername())){
                    agencyId = agency.getId();
                }
            }
            if (agencyId==-1){
                throw new Exception();
            }
            Business business = new Business();
            business.setName(bname);
            business.setAgencyid(agencyId);
            business.setScenicname(sname);
            business.setBeginplace(beginpalce);
            business.setNop(nop);
            business.setPrice(price);
            business.setRenop(nop);
            business.setVehicle(vehicle);
            business.setScale(scale);
            business.setIntroduce(introduce);
            Date begindate = Date.valueOf(begintime);
            Date enddate = Date.valueOf(endtime);
            business.setBegindate(begindate);
            business.setEnddate(enddate);
            String path="C:\\Users\\42908\\IdeaProjects\\travel\\src\\main\\webapp\\scenic\\";
            String filename=agencyId+"_"+sname+"_"+bname;
            for (int i=1;i<=5;i++){
                if(!files[i-1].isEmpty()){
                    String realfilename = filename+i+files[i-1].getOriginalFilename();
                    File targetFile = new File(path,realfilename);
                    if (!targetFile.exists()){
                        targetFile.mkdirs();
                    }
                    files[i-1].transferTo(targetFile);
                    if (i==1){
                        business.setP1(realfilename);
                    } else if(i==2){
                        business.setP2(realfilename);
                    } else if(i==3){
                        business.setP3(realfilename);
                    } else if(i==4){
                        business.setP4(realfilename);
                    } else if(i==5){
                        business.setP5(realfilename);
                    }
                }
            }
            agencyService.saveBusiness(business);
            mav.setViewName("agencyupdatesuccess");
        }catch (Exception e){
            e.printStackTrace();
            mav.setViewName("agencyupdatefail");
        }
        return mav;
    }
    @RequestMapping(value = "/agency/showbusiness", method = RequestMethod.POST)
    public ModelAndView agencyShowBusiness(HttpSession httpSession){
        String username = (String) httpSession.getAttribute("user");
        List<Business> list = agencyService.getBusiness(username);
        ModelAndView mav = new ModelAndView("agencyshowbusiness");
        mav.addObject("businesslist",list);
        return mav;
    }
    @RequestMapping(value = "/agency/findonebusiness", method = RequestMethod.POST)
    public ModelAndView agencyFindoneBusiness(@RequestParam("businessid")Integer id,
                                              HttpSession httpSession){
        ModelAndView mav = new ModelAndView("agencybusinessinfo");
        String username = (String) httpSession.getAttribute("user");
        for (Agency agency:ordinaryService.getAgency()
             ) {
            if (username.equals(agency.getUsername())){
                mav.addObject("agency",agency);
                break;
            }
        }
        List<Business> list = ordinaryService.getBusiness();
        List<Order> list1 = ordinaryService.getOrder();
        List<Order> list2 = new ArrayList<Order>();
        List<Integer> list3 = new ArrayList<Integer>();
        List<Vip> list4 = new ArrayList<Vip>();
        for (Order order:list1
        ) {
            if (order.getBusinessid() == id){
                list2.add(order);
                list3.add(order.getVipid());
            }
        }
        mav.addObject("orders",list2);
        for (Business business:list
        ) {
            if (id == business.getId()){
                mav.addObject("businessinfo",business);
                break;
            }
        }
        for (Vip vip:ordinaryService.getVip()
             ) {
            if (list3.contains(vip.getId())){
                list4.add(vip);
            }
        }
        mav.addObject("vips",list4);
        return mav;
    }
    @RequestMapping(value = "/getBusiness", method = RequestMethod.POST)
    public ModelAndView ordinaryGetBusiness(@RequestParam("form-sname")String sname,
                                            @RequestParam("form-beginplace")String bplace){
            ModelAndView mav = new ModelAndView();
            List<Business> list = ordinaryService.getBusiness();
            List<Business> exlist = new ArrayList<Business>();
            if (!sname.isEmpty()){
                for (Business business:list
                     ) {
                    if (!sname.equals(business.getScenicname())){
                        exlist.add(business);
                    }
                }
            }
            if (!bplace.isEmpty()){
                for (Business business:list
                ) {
                    if (!bplace.equals(business.getBeginplace())){
                        exlist.add(business);
                    }
                }
            }
            list.removeAll(exlist);
            mav.addObject("businesslist",list);
            mav.setViewName("searchbusiness");
            return mav;
    }
    @RequestMapping(value = "/getPersonal", method = RequestMethod.GET)
    public ModelAndView ordinaryGetPersonal(HttpSession httpSession){
        String type = (String) httpSession.getAttribute("type");
        String user = (String) httpSession.getAttribute("user");
        if (type.equals("vip")){
            List<Vip> list = ordinaryService.getVip();
            for (Vip vip:list
                 ) {
                if (user.equals(vip.getUsername())){
                    httpSession.setAttribute("vip",vip);
                    break;
                }
            }
        } else if (type.equals("agency")){
            List<Agency> list = ordinaryService.getAgency();
            for (Agency agency:list
            ) {
                if (user.equals(agency.getUsername())){
                    httpSession.setAttribute("agency",agency);
                    break;
                }
            }
        }
        return new ModelAndView("personal");
    }
    @RequestMapping(value = "/updatevipinfo", method = RequestMethod.POST)
    public ModelAndView ordinaryUpdatePersonal(@RequestParam("form-age")Integer age,
                                               @RequestParam("form-sex")String sex,
                                               @RequestParam("form-cid")String cid,
                                               @RequestParam("form-tel")String tel,
                                               @RequestParam("form-mail")String email,
                                               HttpSession httpSession){
        ModelAndView mav = new ModelAndView("personalcheck");
        try{
            Integer id = ((Vip)httpSession.getAttribute("vip")).getId();
            for (Vip vip:ordinaryService.getVip()
            ) {
                if (id == vip.getId()){
                    vip.setAge(age);
                    vip.setSex(sex);
                    vip.setCid(cid);
                    vip.setTel(tel);
                    vip.setEmail(email);
                    ordinaryService.updateVip(vip);
                    httpSession.setAttribute("vip",vip);
                    break;
                }
            }
            mav.addObject("flag",true);
            return mav;
        }catch (Exception e){
            mav.addObject("flag",false);
            return mav;
        }
    }
    @RequestMapping(value = "/updateagencyinfo", method = RequestMethod.POST)
    public ModelAndView ordinaryUpdatePersonal1(@RequestParam("form-aname")String aname,
                                               @RequestParam("form-pname")String pname,
                                               @RequestParam("form-cid")String cid,
                                               @RequestParam("form-tel")String tel,
                                               @RequestParam("form-mail")String email,
                                               HttpSession httpSession){
        ModelAndView mav = new ModelAndView("personalcheck");
        try{
            Integer id = ((Agency)httpSession.getAttribute("agency")).getId();
            for (Agency agency:ordinaryService.getAgency()
            ) {
                if (id == agency.getId()){
                    agency.setAgencyname(aname);
                    agency.setName(pname);
                    agency.setCid(cid);
                    agency.setTel(tel);
                    agency.setEmail(email);
                    ordinaryService.updateAgency(agency);
                    httpSession.setAttribute("agency",agency);
                    break;
                }
            }
            mav.addObject("flag",true);
            return mav;
        }catch (Exception e){
            mav.addObject("flag",false);
            return mav;
        }
    }
    @RequestMapping(value = "/findonebusiness", method = RequestMethod.POST)
    public ModelAndView ordinaryFindoneBusiness(@RequestParam("businessid")Integer id,
                                                HttpSession httpSession){
        ModelAndView mav = new ModelAndView("businessinfo");
        Integer agencyid = -1;
        List<Business> list = ordinaryService.getBusiness();
        List<Order> list1 = ordinaryService.getOrder();
        List<Order> list2 = new ArrayList<Order>();
        for (Order order:list1
             ) {
            if (order.getBusinessid() == id){
                list2.add(order);
            }
        }
        mav.addObject("orders",list2);
        for (Business business:list
             ) {
            if (id == business.getId()){
                agencyid = business.getAgencyid();
                mav.addObject("businessinfo",business);
                break;
            }
        }
        for (Agency agency:ordinaryService.getAgency()
             ) {
            if (agency.getId() == agencyid){
                mav.addObject("agency",agency);
            }
        }
        return mav;
    }
    @RequestMapping(value = "/findoneorder", method = RequestMethod.POST)
    public ModelAndView findoneOrder(@RequestParam("orderid")Integer id){
        ModelAndView mav = new ModelAndView("showorder");
        Order needorder = new Order();
        for (Order order:ordinaryService.getOrder()
             ) {
            if (order.getId() == id){
                needorder = order;
                break;
            }
        }
        mav.addObject("order",needorder);
        return mav;
    }
    @RequestMapping(value = "/visit", method = RequestMethod.GET)
    public ModelAndView visit(HttpSession httpSession){
        List<Business> list = ordinaryService.getBusiness();
        List<Business> list1 = new ArrayList<Business>(6);
        int a,b,c,d,e,f;
        Random ne = new Random();
        a = ne.nextInt(list.size());
        b = ne.nextInt(list.size());
        c = ne.nextInt(list.size());
        d = ne.nextInt(list.size());
        e = ne.nextInt(list.size());
        f = ne.nextInt(list.size());
        list1.add(list.get(a));
        list1.add(list.get(b));
        list1.add(list.get(c));
        list1.add(list.get(d));
        list1.add(list.get(e));
        list1.add(list.get(f));
        ModelAndView mav = new ModelAndView("main");
        httpSession.setAttribute("businesslist",list1);
        httpSession.setAttribute("type","visitor");
        return mav;
    }
}
