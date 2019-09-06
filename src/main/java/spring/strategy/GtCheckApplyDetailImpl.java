package spring.strategy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@CheckApplyType(value = SysCodeEnum.GT)
public class GtCheckApplyDetailImpl extends AbstractCheckApplyDetail implements BeanPostProcessor {

    @Override
    public boolean checkIsMutalRole() {

        System.out.println("GT 新增一些角色校验");

        return super.checkIsMutalRole();
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

}
