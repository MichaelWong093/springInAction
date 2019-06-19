package com.ithuangw.chapter5_springmvc;

import com.ithuangw.chapter5_springmvc.controller.SpittleController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author Huangw
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/13 12:55
 */
public class SpittleControllerTest {

    @Test
    public void test() throws Exception {
        SpittleController spittleController = new SpittleController();
        //assertEquals("index",demoController.index());
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController).build();
        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }

}