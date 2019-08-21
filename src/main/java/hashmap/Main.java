package hashmap;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("ww", "bee");
        map.put("wea", "vvvb");
        Set<String> set = map.keySet();
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.);
//        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("222");
//        linkedList.add("333");
//        for (int i = 0; i < linkedList.size(); i++) {
//
//            String s = linkedList.get(0);
//            System.out.println(s);
//        }
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

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

//        for (int i = 1; i <= 16; i++) {
//            map.put(i, i);
//        }


//        System.out.println(map);
//        System.out.println(map2);

//        test();

    }

    public static void test(){
    }
}
