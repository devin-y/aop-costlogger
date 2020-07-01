package com.yeauty.service.impl;

import com.yeauty.component.CostLogger;
import com.yeauty.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Yeauty
 * @version 1.0
 * @Description:show effect
 * @date 2018/5/10 10:30
 */
@Slf4j
@Service
public class ShowServiceImpl implements ShowService {

    @CostLogger(LEVEL = CostLogger.Level.INFO)
    @Override
    public void show() {
        for (int i = 0; i < 10; i++) {
            log.info("show service implement : " + i);
        }
    }
}



