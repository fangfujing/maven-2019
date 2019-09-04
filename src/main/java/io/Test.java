package io;

import java.io.*;

public class Test {

    public static void main(String[] args) throws Exception {

//        test1();

//        test2();

//        test3();
//        copy();

        FileInputStream in = new FileInputStream("D:\\maven.jar");
        BufferedInputStream inBuffer = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream("D:\\maven3.jar");
        BufferedOutputStream outBuffer = new BufferedOutputStream(out);
        int len = 0;
        long begin = System.currentTimeMillis();
        while ((len = inBuffer.read()) != -1) {
            outBuffer.write(len);
        }
        System.out.println("复制文件所需时间：" + (System.currentTimeMillis() - begin)); // 平均时间约 160000 毫秒，约 2 分多钟
        in.close();
        out.close();
    }

    private static void copy() throws IOException {
        // 不使用缓冲   copy
        FileInputStream in = new FileInputStream("D:\\maven.jar");
        FileOutputStream out = new FileOutputStream("D:\\maven2.jar");
        int len = 0;
        long begin = System.currentTimeMillis();
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        System.out.println("复制文件所需时间：" + (System.currentTimeMillis() - begin)); // 平均时间约 160000 毫秒，约 2 分多钟
        in.close();
        out.close();
    }

    private static void test3() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D://me.txt");

            int c;
            // 读取写入的二进制文件，输出字节数组
            while ((c = fileInputStream.read()) != -1) {
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void test2() {
        byte[] bytes = {3, 4, 5, 66};

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(new File("D://me.txt"));
            out.write(88);
        } catch (IOException e) {
            e.printStackTrace();
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    private static void test1() {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串");

        char c;

        try {
            c = (char) reader.read();

            System.out.println("你输入的字符为"+c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
