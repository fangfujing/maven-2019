package io;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        InputStream in = null;
        OutputStream ot = null;
        try {
            in = new FileInputStream("D://git-workspace/aa.txt");
            System.out.println(in.available());
            File file = new File("D://git-workspace/bb.txt");
            ot = new FileOutputStream(file);
            int temp = 0;
            while ((temp = in.read()) != 0){
                ot.write(temp);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
