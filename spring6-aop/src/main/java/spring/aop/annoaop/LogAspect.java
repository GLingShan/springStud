package spring.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//切面类
@Component
@Aspect
public class LogAspect {

    //设置切入点和通知类型
    //1.通知类型，前置@Before()，返回@AfterReturning，异常，后置，环绕（try catch）

    /**
     *
     *  @Before(value = "切入点表达式配置")
        execution(目标函数访问修饰符目标函数访问修饰符返回值 spring.aop.annoaop.class.method(int,int))
     */
    @Before(value = "execution(public int spring.aop.annoaop.CalculatorImpl.*(..))")
//    @Before(value = "execution(* int spring.aop.annoaop.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger -- > 前置" + methodName + "->" + args);
    }

    @After(value = "execution(* spring.aop.annoaop.CalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        // 增强的方法的名称
        String methodName = joinPoint.getSignature().getName();
        // 增强的方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger -- > 后置");
    }

    @AfterReturning(value = "execution(* spring.aop.annoaop.CalculatorImpl.*(..))",returning = "result")
    public void afterReturnMethod(JoinPoint joinPoint , Object result){
        // 增强的方法的名称,可以得到返回值
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger -- > 返回通知" + methodName + "返回值 "+result);
    }

}
