package thread;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {


//        Ticket ticket = new Ticket();
//        MyRunable myRunable = new MyRunable(ticket);
//
//
//        new Thread(myRunable).start();
//        new Thread(myRunable).start();

        //同时启动1000个线程，去进行i++计算，看看实际结果

//        int num = 1000;
//        final CountDownLatch countDownLatch = new CountDownLatch(num);
//
//
//        for (int i = 0; i < num; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    Counter.inc();
//                    countDownLatch.countDown();
//                }
//            }).start();
//        }
//
//        countDownLatch.await();
//        //这里每次运行的值都有可能不同,可能为1000
//        System.out.println("运行结果:Counter.count=" + Counter.count);


////        MyThread1 myThread1 = new MyThread1();
//        Runnable runnable = new MyRunable2();
////        Future future = new FutureTask(runnable);
////        myThread1.start();
////        System.out.println("other things....");
//
//
//        Thread tt = new Thread(runnable);
//        tt.start();
////        Future<?> submit = exec.submit(runnable);
//        exec.shutdown();
        ExecutorService exec = Executors.newCachedThreadPool();
//        exec.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("start");
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("end");
//            }
//        });

//        Future<?> submit = exec.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("start");
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("end");
//            }
//        });
//        Future<String> future = exec.submit(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                System.out.println("begin");
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("end");
//                return "myCallable return";
//            }
//        });
//        System.out.println("other things");
////        System.out.println(future.get()+"------------------------");
//        System.out.println("*****************");
//        exec.shutdown();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("start");
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("end");
//            }
//        }).start();

//        System.out.println("------");


        System.out.println("------------------");
        try {
            Thread.sleep(5000);
            if (1 == 1) {
                throw new RuntimeException("my exception");
            }
        } catch (InterruptedException e) {
//            e.printStackTrace();
            return;
        }finally {
            System.out.println("finally()...");
        }

        System.out.println("end");

    }
}
