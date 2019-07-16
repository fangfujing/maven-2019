package jdkproxy;

public class SubjectRel implements Subject {

    @Override
    public Object say(int i) {
        System.out.println("-----hello-----");

        String st = "a";
        if (st != null) {
            
        }
        return i;
    }


}
