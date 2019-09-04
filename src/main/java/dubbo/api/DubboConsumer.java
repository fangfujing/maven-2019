package dubbo.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

public class DubboConsumer {

    public static void main(String[] args) {
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo-api-test");
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("192.168.174.128:2181");

        // 注意：ReferenceConfig为重对象，内部封装了与注册中心的连接，以及与服务提供方的连接
        // 引用远程服务
        // 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
        ReferenceConfig<DemoI> reference = new ReferenceConfig<>();
        reference.setApplication(application);
        // 多个注册中心可以用setRegistries()
        reference.setRegistry(registry);
        reference.setInterface(DemoI.class);
        reference.setVersion("1.0.0");
        // 和本地bean一样使用xxxService
        // 注意：此代理对象内部封装了所有通讯细节，对象较重，请缓存复用
        DemoI testService = reference.get();
        testService.say();
        reference.destroy();
    }
}
