package spring.aop.example;

public class TestCal {
    public static void main(String[] args) {

        //创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());

        Calculator proxy = (Calculator) proxyFactory.getProxy();

        proxy.mul(3,5);

    }
}
