package com.yeauty.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActionMethodService {
  public void add() {
    log.info("====== for interceptor method [aop method]");
  }

}
