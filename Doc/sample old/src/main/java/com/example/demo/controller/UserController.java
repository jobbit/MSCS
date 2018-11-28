package com.example.demo.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Controller
public class UserController {

    @Autowired
    private UserService UserService;
    
    /**
     * 
     * 1. @RequestMapping
     * 2. serlvet api; modelandview
     * 3. json  	{ name : '张三', age : 18 }
     * 
     * @param model
     * @return
     */
//    @RequestMapping("/stu/getAllUser2")
//    public List<User> getAllUser(Model model) {
//    	List<User> list = UserService.getAllUser();
//    	System.out.println(list);
//        return list;
//    }
    
    @RequestMapping(value = "/stu/getAllUser",method = RequestMethod.GET)
    public String getAllUser(HttpServletRequest request){
        List<User> list = UserService.getAllUser();
        System.out.println(list);
        request.setAttribute("User",list);
        return "user";
    }

    @RequestMapping(value = "/stu/insert",method = RequestMethod.GET)
    public String insert(@ModelAttribute("User") User User,Model model){
        UserService.insert(User);
        return "redirect:/stu/getAllUser";
    }

    @RequestMapping(value = "/stu/update",method = RequestMethod.GET)
    public String update(Model model){
        List<User> list = UserService.getAllUser();
//        request.setAttribute("Users",list);
        return "User";
    }

    @RequestMapping(value = "/stu/index",method = RequestMethod.GET)
    public String indexStu(Model model){
        model.addAttribute("User",new User());
        return "insert";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }
    
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){	
        return "login";
    }
    
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(Model model){
        return "register";
    }    
    


}
