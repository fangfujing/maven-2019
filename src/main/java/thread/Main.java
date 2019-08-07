package thread;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {


//        Ticket ticket = new Ticket();
//        MyRunable myRunable = new MyRunable(ticket);
//
//
//        new Thread(myRunable).start();
//        new Thread(myRunable).start();

        //同时启动1000个线程，去进行i++计算，看看实际结果

        int num = 1000;
        final CountDownLatch countDownLatch = new CountDownLatch(num);


        for (int i = 0; i < num; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + Counter.count);

    }
}
