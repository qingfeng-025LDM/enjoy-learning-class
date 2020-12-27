package com.qingfeng.enjoy.spring.cap1.config;

import com.qingfeng.enjoy.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan()
public class Cap3MainConfig {

    /**
     * prototype：多实例，IOC容器启动的时候，不会去调用方法创建对象，而是每次获取对象的时候调用方法创建对象
     * singleton：单实例（默认），IOC容器在启动的时候调用方法创建对象并放到IOC容器中，以后每次获取就是直接从容器中拿
     * request：每一次请求创建一个实例
     * session：同一个会话创建一个实例
     * @return
     */
    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person("jack", 20);
    }

}
