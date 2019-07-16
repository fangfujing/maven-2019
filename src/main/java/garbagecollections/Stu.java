package garbagecollections;

public class Stu {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("gc  run...");
    }
}
