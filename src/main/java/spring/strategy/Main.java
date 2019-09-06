package spring.strategy;

public class Main {


    public static void main(String[] args) {

        HsCheckApplyDetailImpl hsCheckApplyDetail = new HsCheckApplyDetailImpl();

        CheckApplyType annotations = hsCheckApplyDetail.getClass().getAnnotation(CheckApplyType.class);


        System.out.println(annotations.value());
    }
}
