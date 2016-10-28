package ru.bender.spring.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import ru.bender.spring.interfaces.Hand;
import ru.bender.spring.interfaces.Head;
import ru.bender.spring.interfaces.Leg;
import ru.bender.spring.interfaces.Robot;

/**
 * Created by bender on 26.10.16.
 */
public class ModelT1000 implements Robot, InitializingBean, DisposableBean{
    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private boolean soundEnabled;
    private int year;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, boolean soundEnabled, int year) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.soundEnabled = soundEnabled;
        this.year = year;
    }

    public ModelT1000(String color, boolean soundEnabled, int year) {
        this.color = color;
        this.soundEnabled = soundEnabled;
        this.year = year;
    }

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println(getColor());
        System.out.println(getYear());
        System.out.println(isSoundEnabled());
    }


    public void dance() {
        System.out.println("T1000 is dancing...");
    }

    public Hand getHand() {
        return hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHand(Hand hand) {

        this.hand = hand;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy from InterfaceImpl " + this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init from aterPropertSet " + this);
    }
}
