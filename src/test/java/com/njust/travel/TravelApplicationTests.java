package com.njust.travel;

import com.njust.travel.service.AdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TravelApplicationTests {

//    @Resource(name = "adminService")
//    private AdminService adminService;
//
//    @Test
//    public void contextLoads() {
//        boolean flag = adminService.login("admin", "123456");
//        Assert.assertEquals(flag, true);
//    }

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;
    @Test
    public void setupMockMvc() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
        mvc.perform(MockMvcRequestBuilders.post("/admin/deleteBusiness")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .param("id", "2")
                    )
            .andDo(MockMvcResultHandlers.print());
    }
}
