package spring.strategy;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractCheckApplyDetail implements CheckApplyDetail {

    @Override
    public boolean checkStatus() {
        System.out.println("校验状态");
        return true;
    }

    @Override
    public boolean checkIsMutalRole() {
        System.out.println("校验角色逻辑...");
        return false;
    }


}
