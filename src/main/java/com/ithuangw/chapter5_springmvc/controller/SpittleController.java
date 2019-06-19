package com.ithuangw.chapter5_springmvc.controller;

import com.ithuangw.chapter5_springmvc.dao.SpittleRepository;
import com.ithuangw.chapter5_springmvc.entity.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Huangw
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/13 11:25
 */
@Controller
public class SpittleController {

    private SpittleRepository spittleRepository;

    public SpittleController() {
    }

    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    /*@RequestMapping("/{id}")
    public String index(@PathVariable("id") String id, Model model) {
        model.addAttribute("id", id);
        return "index";
    }*/

    @RequestMapping("/spittles")
    public String spittles(Model model) {
        List<Spittle> spittles = spittleRepository.findSpittles(Long.MAX_VALUE, 20);
        model.addAttribute("spittleList", spittles);
        return "list";
    }
}
