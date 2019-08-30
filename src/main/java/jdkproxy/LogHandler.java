package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {

    private Subject target;

    public LogHandler(Subject object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long l = System.currentTimeMillis();

        Object result = method.invoke(target, args);

        System.out.println("耗时:"+(System.currentTimeMillis() - l));

        return result;
    }

    public Subject getProxy(){

        return (Subject) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this::invoke);
    }
}
