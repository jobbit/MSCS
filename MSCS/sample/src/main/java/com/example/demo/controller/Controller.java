package com.example.demo.controller;

import com.example.demo.entity.User;

import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public String getAllUser(HttpServletRequest request){
        List<User> list = userService.getAllUser();
        request.setAttribute("user",list);
        return "user";
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String insert(User user,Model model){
        userService.insert(user);
        return "redirect:/getAllUser";
    }

    @RequestMapping(value = "/loginaction",method = RequestMethod.GET)
    public String dologin(User user,Model model){
        userService.dologin(user);
        System.out.println(userService.logincheck());
        if(userService.dologin(user)==true) {
            return "redirect:/getAllUser";
        }
        else{
            return "redirect:/login";
        }
    }


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        return "login";
    }

    @RequestMapping(value = "/createUser",method = RequestMethod.GET)
    public String createUser(Model model){
        model.addAttribute("user",new User());
        return "createUser";
    }


}
