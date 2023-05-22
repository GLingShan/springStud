package spring.aop.annoaop;

import java.util.Arrays;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类
@Component
@Aspect
public class LogAspect {

    //设置切入点和通知类型
    //1.通知类型，前置@Before()，返回@AfterReturning，异常，后置，环绕（try catch）

    /**
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

    @After(value = "pointCut()")
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

    @AfterThrowing(value = "execution(* spring.aop.annoaop.CalculatorImpl.*(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Throwable ex){
        // 增强的方法的名称
        String methodName = joinPoint.getSignature().getName();
        // 增强的方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger -- > 异常通知" + methodName + "异常信息 "+ex);
    }

    @Around(value = "execution(* spring.aop.annoaop.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        // 增强的方法的名称
        String methodName = joinPoint.getSignature().getName();
        // 增强的方法的参数
        Object[] args = joinPoint.getArgs();
        String s = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("环绕通知=>>>在目标方法之前执行");

            //调用目标方法
            result = joinPoint.proceed();

            //目标方法返回值之后执行，环绕通知、
            System.out.println("环绕通知=>>>目标方法返回值之后执行");
        }catch (Throwable throwable){
            System.out.println(throwable);
            System.out.println("环绕通知=>>>异常通知");
        }finally {
            System.out.println("环绕通知=>>>目标方法彻底执行完毕");
        }
        return result;
    }

    @Pointcut(value = "execution(* spring.aop.annoaop.CalculatorImpl.*(..))")
    public void pointCut(){}

}
