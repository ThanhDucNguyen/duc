package com.example.test1.demo.controllers;

import com.example.test1.demo.dto.BankDTO;
import com.example.test1.demo.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.swing.*;
import javax.validation.Valid;

@Controller
public class BankController {

    @Autowired
    private BankService bankService;

//    @GetMapping(value = "/add")
//    public ModelAndView Bank(){
//        ModelAndView mav = new ModelAndView();
//        BankDTO bankDTO =new BankDTO();
//        mav.addObject("bankdto", bankDTO);
//        mav.setViewName("add");
//        return mav;
//    }
//    @PostMapping(value = "/add-process")
//    public ModelAndView addBank(@Valid BankDTO bankDTO){
//
//        ModelAndView mav = new ModelAndView();
//        bankService.addBank(bankDTO);
//        mav.setViewName("redirect:/add");
//        mav.addObject("bank", new BankDTO());
//        return mav;
//    }
    @GetMapping(value = "/")
    public ModelAndView Bank(){
        ModelAndView mav = new ModelAndView();
//        mav.addObject("bankdto", new BankDTO());
        mav.setViewName("add");
        return mav;
    }
//    @PostMapping(value = "/add-process")
//    public ModelAndView addBank(BankDTO bankDTO, HttpSession session){
//        System.out.println(bankDTO);
//        session.setAttribute("bankdto", bankDTO);
//        bankService.addBank(bankDTO);
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("redirect:/add");
//        return mav;
//    }
}
