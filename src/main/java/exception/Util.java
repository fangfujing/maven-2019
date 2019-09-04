package exception;

public class Util {

    public static void test(int i) throws Exception {

        if(i == 1){
            throw new RuntimeException("111");
        }
    }
}
