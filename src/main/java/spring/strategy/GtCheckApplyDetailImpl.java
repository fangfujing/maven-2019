package spring.strategy;

import org.springframework.stereotype.Component;

@Component
@CheckApplyType(value = SysCodeEnum.GT)
public class GtCheckApplyDetailImpl extends AbstractCheckApplyDetail {

    @Override
    public boolean checkIsMutalRole() {

        System.out.println("GT 新增一些角色校验");

        return super.checkIsMutalRole();
    }
}
