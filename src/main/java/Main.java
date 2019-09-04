public class Main {

    public static void main(String[] args) {


        final String name = "aa";

        new Thread(new Runnable() {
            @Override
            public void run() {
                name.equals("");
            }
        }).start();

        System.out.println("KKKK---");

    }
}
