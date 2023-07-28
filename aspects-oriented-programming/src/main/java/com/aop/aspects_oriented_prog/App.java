package com.aop.aspects_oriented_prog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.aspects_oriented_prog.services.Login;
import com.aop.aspects_oriented_prog.services.LoginImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
       Login login =  applicationContext.getBean("login",Login.class);
       login.login();
    
       
       
    }
}
