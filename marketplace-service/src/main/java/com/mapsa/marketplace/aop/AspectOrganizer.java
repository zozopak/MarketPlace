package com.mapsa.marketplace.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AspectOrganizer {
    private final Logger LOGGER= LoggerFactory.getLogger("AspectOrganizer.class");
   @AfterReturning(pointcut = "execution(* com.mapsa.marketplace.controller.*.get*(..))",returning = "result")
    public void getResult(JoinPoint joinPoint,Object result){

      log.info("result is here!");
       System.out.println(result);

    }
}
