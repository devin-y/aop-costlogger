package com.yeauty.controller;

import com.yeauty.service.ActionAnnotationService;
import com.yeauty.service.ActionMethodService;
import com.yeauty.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  @Autowired
  private ShowService showService;

  @Autowired
  private ActionMethodService actionMethodService;

  @Autowired
  private ActionAnnotationService actionAnnotationService;

  @GetMapping(value = "show")
  public String show(){
    showService.show();
    return "abc123";
  }

  @GetMapping(value = "hello")
  public String hello(){
    return "hello world";
  }


  @GetMapping(value = "action-anno")
  public String actionAnno(){
    actionAnnotationService.add();
    return "hello world";
  }

  @GetMapping(value = "action-method")
  public String actionMethod(){
    actionMethodService.add();
    return "hello world";
  }
}
