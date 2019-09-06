package spring.strategy;

import org.springframework.stereotype.Component;

@Component
public class CheckApplyDetailFactory {

    public static CheckApplyDetail getCheckApplyDetailInstance (String sysCode){

        if(SysCodeEnum.GT.getSysCode().equals(sysCode)){
            return new GtCheckApplyDetailImpl();
        }else if(SysCodeEnum.HS.getSysCode().equals(sysCode)){
            return new HsCheckApplyDetailImpl();
        }else {
            throw new RuntimeException("getCheckApplyDetailInstance is not found by sysCode:" + sysCode);
        }

    }
}
