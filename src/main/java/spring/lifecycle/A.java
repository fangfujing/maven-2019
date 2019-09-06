package spring.lifecycle;

import javax.annotation.PostConstruct;

public class A {

    private String name;

    public A() {
        System.out.println("A()...");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct()");
    }

    public void initA(){
        System.out.println("initA()...");
    }

    public void say(){
        System.out.println("say()...");
    }

}
