package com.preperad.to.interview.algoritm.aopFunctional;

import com.preperad.to.interview.algoritm.dto.algorithmsDto.Request;
import com.preperad.to.interview.algoritm.dto.UsageLog;
import com.preperad.to.interview.algoritm.repository.UsageLogRepository;
import com.preperad.to.interview.algoritm.repository.UserService;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
@AllArgsConstructor
public class LoggingAspect {

    private final UserService userService;

    @Pointcut("@annotation(UsageLogging) && args(request,..))")
    public void callSolveMethod(Request request) {
    }
    @Before("callSolveMethod(request)")
    public void afterCallSolve(Request request) {
        UsageLog log = new UsageLog();
        log.setCustomer(request.getCustomer());
        log.setAlgorithm(request.getAlgorithmType());
        log.setDate(new Date());
        userService.saveUserLog(log);
    }
}
