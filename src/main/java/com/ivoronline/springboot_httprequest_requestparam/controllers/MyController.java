package com.ivoronline.springboot_httprequest_requestparam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello(@RequestParam String name) {
    return "Hello " + name;
  }

}




