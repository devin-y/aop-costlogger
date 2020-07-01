package com.yeauty.component;


import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ActionAspect {
  @Pointcut("@annotation(com.yeauty.component.Action)")
  public void annotationPointCut() {
    log.info("======== annotationPointCut");
  }

  @After("annotationPointCut()")
  public void after(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature)joinPoint.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    log.info("======== 注解式拦截" + action.name());
  }

  @Before("execution(* com.yeauty.service.ActionMethodService.*(..))")
  public void before(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature)joinPoint.getSignature();
    Method method = signature.getMethod();
    log.info("======== 方法规则式拦截，" + method.getName());
  }
}
