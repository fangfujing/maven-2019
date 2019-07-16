package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    private Subject target;

    public LogHandler(Subject object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long l = System.currentTimeMillis();

        Object invoke = method.invoke(target, args);

        System.out.println(System.currentTimeMillis() - l);

        return invoke;
    }
}
