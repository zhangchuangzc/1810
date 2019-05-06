package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
class PageController {
    //北湖
    @RequestMapping("totree")
    public String totree() {

        return "tree";
    }
    @RequestMapping("togoods")
    public String togoods(){

        return "goods";
    }
      @RequestMapping("togoods")
    public String togoods(){

        return "goods";
    }
}
