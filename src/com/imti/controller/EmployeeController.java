package com.imti.controller;

import com.imti.pojo.Employee;
import com.imti.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @Author: ahy
 * @Date:2020/4/15
 * @Description:com.imti.controller
 * @Version:1.0
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //@RequestMapping("/find")
    @RequestMapping(value ={"/find1","/find2"})
    public String findEmp(Model model){
        System.out.println("hello");
        Employee empById = employeeService.findEmpById(3);
        model.addAttribute("emp",empById);
        return "info";
    }

    @RequestMapping(value ={"/find3","/find4"})
    public ModelAndView findEmp2(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws UnsupportedEncodingException {
        String name = request.getParameter("name");
        System.out.println(name);

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("info");
        return mv;
    }
}
