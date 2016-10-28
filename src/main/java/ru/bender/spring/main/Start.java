package ru.bender.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bender.spring.interfaces.Robot;
import ru.bender.spring.interfaces.RobotConveyor;

/**
 * Created by bender on 26.10.16.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        RobotConveyor conveyor = (RobotConveyor) context.getBean("robotConveyor");
        Robot robot1 = conveyor.createRobot();
        Robot robot2 = conveyor.createRobot();
        Robot robot3 = conveyor.createRobot();

        System.out.println("robot1 " + robot1);
        System.out.println("robot2 " + robot2);
        System.out.println("robot3 " + robot3);

        robot1.action();
        robot2.action();
        robot3.action();
    }
}
