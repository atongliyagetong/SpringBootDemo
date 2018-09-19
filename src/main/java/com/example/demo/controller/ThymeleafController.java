package com.example.demo.controller;

import com.example.demo.domain.Glf;
import com.example.demo.mapper.GlfMapper;
import com.example.demo.properties.HeroProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/th")
public class ThymeleafController {

    @Autowired
    private HeroProperties heroProperties;

    @Autowired
    private GlfMapper glfMapper;


    @RequestMapping("/heroName")
    public String person(ModelMap map) {
        String heroName = heroProperties.getName();
        map.addAttribute("name", heroName);
        return "person";
    }

    @RequestMapping("/glfList")
    public String glf(ModelMap map) {
        Collection<Glf> glfs =  glfMapper.findGlfAll();
        map.addAttribute("glfList", glfs);
        return "thymeleaf/glfList";
    }
}
