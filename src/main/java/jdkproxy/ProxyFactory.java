package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyFactory implements InvocationHandler {

    //　这个就是我们要代理的真实对象
    private Object subject;

    public ProxyFactory(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理");
        method.invoke(subject, args);
        return null;
    }
}
