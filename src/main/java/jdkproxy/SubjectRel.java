package jdkproxy;

public class SubjectRel implements Subject {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public Object say(int i) {
        System.out.println("-----hello-----");

        String st = "a";
        if (st != null) {
            
        }
        return i;
    }


    @Override
    public void test(){

    }
}
