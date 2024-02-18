//package com.jsp.shoppingcart.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//
//@Aspect
//@Component
//public class LoggerAspect {
//
//	org.slf4j.Logger log;
//	
//	@Pointcut("execution(* com.jsp.shoppingcart.controller.*.*(..))")
//	public void controllerLogs() {};
//	
//	@Before("controllerLogs()")
//	public void beforeController(JoinPoint joinpoint) {
//		log=LoggerFactory.getLogger(joinpoint.getSignature().getDeclaringType());
//		log.info("Invoked : "+ joinpoint.getSignature());
//	}
//	@After("controllerLogs()")
//	public void afterController(JoinPoint joinpoint) {
//		log=LoggerFactory.getLogger(joinpoint.getSignature().getDeclaringType());
//		log.info("Exited : "+ joinpoint.getSignature());
//	}
//
//	@Pointcut("execution(* com.jsp.shoppingcart.service.*.*(..))")
//	public void  serviceLogs() {};
//	
//	public void afterExecution(JoinPoint jp) {
//		log= LoggerFactory.getLogger(jp.getSignature().getDeclaringType());
//		log.info("Execution  : "+jp.getSignature());
//	}
//	
//	@Pointcut("execution(* *.*.*.*.util.ApplicationExceptionHandler.* (..))")
//	public void adviceLogs() {};
//	
//	@Before("adviceLogs()")
//	public void logAfterHandlerMethodInvocation(JoinPoint jp) {
//		
//		Exception ex=(Exception) jp.getArgs()[0];
//		
//		log=LoggerFactory.getLogger(jp.getSignature().getDeclaringType());
//		log.error(ex.getMessage());
//		log.error("Accured at : "+ ex.getStackTrace()[0].getLineNumber());
//	}
//	
//}
