package thread;

public class MyThread1 extends Thread{

    @Override
    public void run() {

        try {
            System.out.println("begin");
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
