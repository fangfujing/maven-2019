package thread;

public class T {

    boolean running = false;

    void m(){
        System.out.println("start...");
        while (running){
            System.out.println("...");
        }
        System.out.println("end...");
        System.out.println("563...");
        System.out.println("startww");
    }

    public static void main(String[] args) {
		 System.out.println("end...123");
    }

}
