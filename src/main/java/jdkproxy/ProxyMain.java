package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyMain {

    public static void main(String[] args) {


//        SubjectRel rel = new SubjectRel();
//
//        ProxyFactory proxyFactory = new ProxyFactory(rel);
//
//        Subject proxy =(Subject) Proxy.newProxyInstance(proxyFactory.getClass().getClassLoader(),
//                rel.getClass().getInterfaces(), proxyFactory);
//
//        System.out.println(proxy.getClass());
//        proxy.say();


        Class[] cs = {Subject.class};
        Subject subjectProxy = (Subject)Proxy.newProxyInstance(Subject.class.getClassLoader(), cs,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理执行");
                        System.out.println(method.getName());
                        return null;
                    }
                });

        System.out.println(subjectProxy.getClass());
        subjectProxy.say();

    }
}
