package cn.harryai.sigtermtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class SigtermTestController {

    @GetMapping("calc")
    public void calc() throws InterruptedException {
        log.info("I'm going to start calculate !");
        long startTime = System.currentTimeMillis();
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            long endTime = System.currentTimeMillis() - startTime;
            log.info("I'm calculating,the current time is {}", endTime / 1000);
            if (endTime > 1 * 60 * 1000) {
                break;
            }
        }

        log.info("I've done the calculation !");


    }


}
