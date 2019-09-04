package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(3333);

        final Socket accept = serverSocket.accept();


        new Thread(new Runnable() {
            @Override
            public void run() {
                InputStream inputStream = null;
                try {
                    inputStream = accept.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                handler(inputStream);
                try {
                    inputStream.close();
                    accept.close();
                    System.out.println("close sucess");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

    private static void handler(InputStream inputStream) {
        int len;
        byte[] data = new byte[1024];

        try {
            while ((len = inputStream.read(data)) != -1){
                System.out.println(new String(data, 0, len));
//                OutputStream outputStream = new FileOutputStream("/home/fang/")
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
