package mybaits;

import mybaits.dao.MenuMapper;
import org.apache.ibatis.annotations.Param;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Class<MenuMapper> menuMapperClass = MenuMapper.class;

        Method[] methods = menuMapperClass.getMethods();

        for (Method method : methods) {
            if("selectMenuByMenuId".equals(method.getName())){
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();

                System.out.println(parameterAnnotations.length+"@@");
                Annotation[] parameterAnnotation = parameterAnnotations[0];
                System.out.println(parameterAnnotation.length);
                for (int i = 0; i < parameterAnnotation.length; i++) {

                    Param param = (Param) parameterAnnotation[i];
//                    System.out.println(param.value());
                }

            }

        }


        int array[][] = {{3,6,7},{8,0,1},{11,9,8},{12,90,8}};

//        System.out.println(array[0].length);
        for (int i = 0; i < array.length ; i++) {

//            for (int j = 0; j < 3; j++) {
//
////                System.out.println(array[i][j]);
//            }

        }
    }
}
