package thread;

public class Ticket {

    private volatile Integer num = 100;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void sale(){
        num--;
    }
}
