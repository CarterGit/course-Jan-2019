package com.bht.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//@Aspect
public class UserAspect {

    //@Before("execution(* com.bht.aop.model.User.set*(..))")
    public void doBeforeCheck(){
        System.out.println("** AOP adivce BEFORE is triggered!**");
    }

    //@After("within(com.bht.aop.model.User)")
    public void doAfterCheck(){
        System.out.println("** AOP adivce AFTER is triggered!**");
    }

   //@Around("execution(* com.bht.aop.model.User.set*(..))")
    public void doAroundCheck(ProceedingJoinPoint pjp){
        System.out.println("** AOP Advice AROUND is triggered, BEFORE execution join point **");
       try {
           pjp.proceed();
       } catch (Throwable throwable) {
           throwable.printStackTrace();
       }
       System.out.println("** AOP Advice AROUND is triggered, AFTER execution join point**");
   }

   //@AfterThrowing("execution(* com.bht.aop.model.User.*(..))")
    public void doAfterThrowing(){
       System.out.println("** AOP advice AFTER THROWING is triggered!");
   }
}
