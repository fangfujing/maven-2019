package hashmap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();

//        Stu s = new Stu();
//        s.setAge(1);
//        s.setName("bb");
//        Stu s2 = new Stu();
//        s2.setAge(12);
//        s2.setName("bb");
//
//        System.out.println(s.hashCode());
//        System.out.println(s2.hashCode());
//        map.put(s, "b");
//        System.out.println(map.get(s));

        for (int i = 1; i <= 16; i++) {
            map.put(i, i);
        }


//        System.out.println(map);
//        System.out.println(map2);

//        test();

    }

    public static void test(){
    }
}
