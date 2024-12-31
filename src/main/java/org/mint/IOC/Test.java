package org.mint.IOC;

import org.mint.configuration.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 薄荷
 * @create 2024-12-27 11:33
 **/

public class Test {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);//单个配置
        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext("org.mint.IOC");//多个配置
//        System.out.println(applicationContext.getBean("data"));
        System.out.println(applicationContext1.getBean(DataConfig.class));
        System.out.println(applicationContext1.getBean(GlobalConfig.class));
    }
}
