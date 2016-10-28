package ru.bender.spring.impls.robotpool;

import ru.bender.spring.interfaces.Robot;
import ru.bender.spring.interfaces.RobotPool;

import java.util.Collection;

/**
 * Created by bender on 29.10.16.
 */
public class T1000Pool  implements RobotPool{
    Collection<Robot> robots;

    public void action() {
        robots.forEach(robot -> robot.action());
    }

    public void setRobots(Collection<Robot> robots) {
        this.robots = robots;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return robots;
    }
}
