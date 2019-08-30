package jdkproxy;

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
//        Subject subject = new SubjectRel();
//
//        Subject o = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), Subject.class.getInterfaces(), new LogHandler(subject));
//
//        System.out.println(o.say(2));


        Subject subject = new SubjectRel();

        LogHandler logHandler = new LogHandler(subject);

        Subject proxy = logHandler.getProxy();

        proxy.test();
    }
}
