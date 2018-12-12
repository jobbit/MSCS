package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;

import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Controller
public class StudentController {

    int usercheck = 0;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/stu/getAllStudent",method = RequestMethod.GET)
    public String getAllStudent(HttpServletRequest request){
        List<Student> list = studentService.getAllStudent();
        request.setAttribute("students",list);
        return "student";
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public String getAllUser(HttpServletRequest request){
        List<User> list = userService.getAllUser();
        request.setAttribute("user",list);
        return "user";
    }

    @RequestMapping(value = "/stu/insert",method = RequestMethod.GET)
    public String insert(@ModelAttribute("student") Student student,Model model){
        studentService.insert(student);
        return "redirect:/stu/getAllStudent";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String insert(User user,Model model){
        userService.insert(user);
        return "redirect:/getAllUser";
    }


    @RequestMapping(value = "/stu/update",method = RequestMethod.GET)
    public String update(Model model){
        List<Student> list = studentService.getAllStudent();
//        request.setAttribute("students",list);
        return "student";
    }

    @RequestMapping(value = "/stu/index",method = RequestMethod.GET)
    public String indexStu(Model model){
        model.addAttribute("student",new Student());
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

    @RequestMapping(value = "/createUser",method = RequestMethod.GET)
    public String createUser(Model model){
        model.addAttribute("user",new User());
        return "createUser";
    }

//    @RequestMapping(value = "/user/login",method = RequestMethod.GET)
//    public String logincheck(Model model){
//
//        if(usercheck == 1){
//            return "index";
//        }
//        else{
//            return "error";
//        }
//
//    }





}
