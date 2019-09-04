package socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {

    private static String ip ="192.168.174.131";

    public static void main(String[] args) {

        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 3333);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true){
            try {
                System.out.print("请输入:");
                Scanner sc = new Scanner(System.in);
                String next = sc.next();
                if("88".equals(next)){
                    socket.shutdownOutput();
                    break;
                }
                socket.getOutputStream().write((new Date() + "---"+next).getBytes());
                Thread.sleep(2000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
