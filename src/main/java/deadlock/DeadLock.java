package deadlock;

import classload.Stu;

public class DeadLock {

    public final static Object obj1 = new Object();

    public final static Object obj2 = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (DeadLock.obj1) {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("+++++");

                        synchronized (DeadLock.obj2) {
                            System.out.println("----");
                        }
                    }
                }
            }
        }).start();



        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    synchronized (DeadLock.obj2) {

                        System.out.println("@!!!!!!!");
                        synchronized (DeadLock.obj1) {
                            System.out.println("###");
                        }

                    }
                }
            }
        }).start();


        Stu stu = new Stu();
    }

}
