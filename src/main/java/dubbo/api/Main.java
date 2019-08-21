package dubbo.api;

import dubbo.api.impl.DemoImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.util.concurrent.CountDownLatch;

public class Main {

    private static String zookeeperHost = "192.168.26.128";

    public static void main(String[] args) throws Exception {

        ServiceConfig<DemoI> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig("first-dubbo-provider"));
        service.setRegistry(new RegistryConfig("zookeeper://" + zookeeperHost + ":2181"));
        service.setInterface(DemoI.class);
        service.setRef(new DemoImpl());
        service.export();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();

    }
}
