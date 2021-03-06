package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.lifecycle.A;
import spring.strategy.CheckApplyDetail;
import spring.strategy.CheckApplyDetailContext;
import spring.strategy.SysCodeEnum;

public class SpringTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("config.xml");

        A bean = context.getBean(A.class);

        bean.say();


//        testStrategy(context);

        context.destroy();
    }

    private static void testStrategy(ClassPathXmlApplicationContext context) {
        CheckApplyDetailContext bean = context.getBean(CheckApplyDetailContext.class);

        CheckApplyDetail checkApplyDetail = bean.getCheckApplyDetail(SysCodeEnum.GT.getSysCode());

        checkApplyDetail.checkIsMutalRole();
    }


}
