package innerclass;

import org.apache.ibatis.javassist.runtime.Inner;

public class Outer {

    private static String name = "admin";

    private Inner inner = new Inner();

    public void show(){
        System.out.println(inner.age);
    }

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Inner{

        private int age = 10;

        public void say(){
            System.out.println("inner say()..."+"this is outer name:"+name);
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Outer outer = new Outer();

        outer.getInner().say();

        outer.show();

    }
}
