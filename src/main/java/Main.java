import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        final String name = "aa";

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                name.equals("");
//            }
//        }).start();
//
//        System.out.println("---");

        String[] strs = {"1", "2", "3"};


        List<String> list = new ArrayList<>();
        list.add("3");


    }


    public static void test(String... strings){
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
