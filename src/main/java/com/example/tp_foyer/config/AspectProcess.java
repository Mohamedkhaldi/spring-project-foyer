package com.example.tp_foyer.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AspectProcess {
    @Around("execution(* tn.esprit.tp_foyer.service.FoyerServiceImp.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        try{
            Object obj =pjp.proceed();
            return obj;
        } finally {
            long elapsedTime = System.currentTimeMillis();
            String methodName = pjp.getSignature().getName();
            log.info("Method [{}] execution time:{} ms", methodName, elapsedTime);
        }

    }
}
