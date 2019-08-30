package classload;

public class Stu {

    public static int i;

    protected void add() {

        System.out.println("add()...");
    };

    static {
        System.out.println("static()...");
    }

    {
        System.out.println("代码块");
    }

    public Stu() {
        System.out.println("init stu...");
    }

    public static void test(){
        System.out.println("static test()...");
    }
}
