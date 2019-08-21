package dubbo.api.impl;

import dubbo.api.DemoI;

public class DemoImpl implements DemoI {

    @Override
    public void say() {

        System.out.println("say()...");
    }
}
