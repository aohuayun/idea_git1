package com.imti.controller;

import com.imti.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

/**
 * @Author: ahy
 * @Date:2020/4/16
 * @Description:com.imti.controller
 * @Version:1.0
 */
@Controller
public class EmployeeController2 {

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam(value = "name",required = false) String rname, Integer password){
        System.out.println(rname+","+password);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",rname);
        mv.addObject("password",password);
        mv.setViewName("info");
       return mv;
    }

    @RequestMapping("/login2")
    public ModelAndView login2(User user){
        System.out.println(user.getName()+","+user.getPassword());
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("info");
        return mv;
    }
}
