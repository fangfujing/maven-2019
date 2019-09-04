package sping;

import classload.Stu;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

public class SpringTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("config.xml");
        Stu bean = context.getBean(Stu.class);

        System.out.println(bean);


        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource resource = resourceLoader.getResource("classpath:a.txt");

        System.out.println(resource.getClass());

        //验证返回的是ClassPathResource
        try {

            System.out.println(resource.getInputStream().available());

        } catch (IOException e) {
            e.printStackTrace();
        }



//        try {
//            InputStream io = new FileInputStream("a2.txt");
//
//            try {
//                System.out.println(io.available());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            finally {
//                try {
//                    io.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }


}
