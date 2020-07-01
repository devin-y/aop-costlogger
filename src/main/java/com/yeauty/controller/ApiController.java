package com.yeauty.controller;

import com.yeauty.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  @Autowired
  private ShowService showService;

  @GetMapping(value = "show")
  public String show(){
    showService.show();
    return "abc123";
  }

  @GetMapping(value = "hello")
  public String hello(){
    return "hello world";
  }
}
