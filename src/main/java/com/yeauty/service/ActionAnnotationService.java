package com.yeauty.service;

import com.yeauty.component.Action;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActionAnnotationService {
  @Action(name = "注解式拦截的add操作")
  public void add() {
    log.info("========== 真正执行到了DemoAnnotationService的add方法[aop annotation]");
    log.info("========== 方法结束[aop annotation]");
  }
}
