package spring.strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class CheckApplyDetailContext implements ApplicationContextAware {

    {
        Class<?>[] interfaces = CheckApplyDetail.class.getInterfaces();

    }

    private Map<String, CheckApplyDetail> checkApplyDetailMap = new HashMap<>(20);

    public CheckApplyDetail getCheckApplyDetail(String sysCode){
        return checkApplyDetailMap.get(sysCode);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        Map<String, CheckApplyDetail> map = applicationContext.getBeansOfType(CheckApplyDetail.class);
        Set<Map.Entry<String, CheckApplyDetail>> entries = map.entrySet();
        for (Map.Entry<String, CheckApplyDetail> entry : entries) {
            CheckApplyDetail value = entry.getValue();
            CheckApplyType annotations = value.getClass().getAnnotation(CheckApplyType.class);
            checkApplyDetailMap.put(annotations.value().getSysCode(), value);
        }
    }
}
