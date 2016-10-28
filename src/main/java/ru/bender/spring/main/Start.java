package ru.bender.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bender.spring.impls.robot.ModelT1000;

/**
 * Created by bender on 26.10.16.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ModelT1000 myRobot = (ModelT1000) context.getBean("T1000");
        ModelT1000 myRobot2 = (ModelT1000) context.getBean("T1000");
        myRobot.action();
        myRobot2.dance();
        System.out.println(myRobot);
        System.out.println(myRobot2);
    }
}
