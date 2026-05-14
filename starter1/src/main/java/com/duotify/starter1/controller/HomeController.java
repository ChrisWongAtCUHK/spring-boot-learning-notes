package com.duotify.starter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Autowired
  private String appName;

  @RequestMapping("/")
  String home() {
    return "Hello " + this.appName + "!";
  }
}
