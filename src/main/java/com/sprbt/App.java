package com.sprbt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 该注解指定项目为springboot，由此类当作程序入口
   自动装配 web 依赖的环境
 */

@SpringBootApplication
@MapperScan("com.sprbt.StudentRepository")
public class App 
{
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
        
    }
}
