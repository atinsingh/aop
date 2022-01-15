package co.pragra.learning.aopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Pointcut("execution(* co.pragra.learning.aopdemo.model.Game.*(*,*,*))")
    private void pt1(){

    }

    @Pointcut("execution(* co.pragra.learning.aopdemo.model.Game.*())")
    private void pt2(){

    }

    public void doLogging(JoinPoint point){
        System.out.println(point.getSignature());
        System.out.println("******RUNNING LOGS********");
    }

    @AfterReturning("pt1() || pt2()")
    public void doLogging2(JoinPoint point){
        //System.out.println(point.getArgs());
        for (Object o: point.getArgs()){
            System.out.println(o);
        };
    }
}
