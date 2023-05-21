package spring.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    //目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理对象
    public Object getProxy(){
        //三个参数
        /**
         * ClassLoader类加载器，加载动态生成代理类的类加载器
         * interfaces[] 目标对象实现的所有接口类
         * InvocationHandler 设置代理对象，实现目标对象方法的函数
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {

            //具体实现日志输出

            /**
             * @param proxy 代理对象
             * @param method 目标对象的实现方法，需要重写
             * @param args  对应方法的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理[日志]" + method.getName() + " 方法开始了，参数是：" + args);
                //掉用目标方法
                Object result = method.invoke(target, args);
                System.out.println("动态代理[日志]" + method.getName() + " 方法结束了，结果是：" + result);
                return result;
            }
        };
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return proxy;
    }
}
