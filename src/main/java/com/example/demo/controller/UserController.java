package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.example.demo.properties.HeroProperties;

import java.util.*;

@RestController
public class UserController {
/*
    @Value("${hero.name}")
    private String name;

    @Value("${hero.skin}")
    private String skin;

    @Value("${hero.content}")
    private String content;
*/

    @Autowired
    private HeroProperties heroProperties;

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if (userRepository.save(user)) {
            System.out.printf("用户对象:%s 保存成功！\n", user);
        }
        return user;
    }

    @GetMapping("/person/get")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        Map<Integer, User> repository = userRepository.getReposiory();
        Set<Map.Entry<Integer, User>> entrySet = repository.entrySet();
        Iterator<Map.Entry<Integer, User>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, User> entry = iterator.next();
            User user = entry.getValue();
            users.add(user);
        }
        return users;
    }

    @GetMapping("/person/findHero")
    public String getHero(){
        return heroProperties.toString();
    }

}
