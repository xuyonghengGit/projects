package com.ck.controller;

import com.ck.entity.tuser;
import com.ck.service.Ituserice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;
@Controller
public class indexcontriller {
    @Autowired
    private Ituserice dao;

    @RequestMapping("/")
    public String index(ModelMap map){
        List<tuser> query = dao.query();
        map.addAttribute("list",query);
        return "index";
    }
}
