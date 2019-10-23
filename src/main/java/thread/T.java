package thread;

public class T {

    boolean running = true;

    void m(){
        System.out.println("start...");
        while (running){
            System.out.println("...");
        }
        System.out.println("end...");
        System.out.println("end...");
    }

    public static void main(String[] args) {
		 System.out.println("end...");
    }

}
