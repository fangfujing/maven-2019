package thread;

public class MyRunable implements Runnable {

    private Ticket ticket;

    public MyRunable() {
    }

    public MyRunable(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {

        while (ticket.getNum() > 0){
            ticket.sale();
            System.out.println(Thread.currentThread().getName()+"当前票数:"+ ticket.getNum());
        }

    }
}
