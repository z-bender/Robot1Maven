package ru.bender.spring.interfaces;

/**
 * Created by bender on 27.10.16.
 */
public interface Parent {
    public default void initObject(){
        System.out.println("init from Parent" + this);
    }

    public default void destroyObject(){
        System.out.println("destroy from Parent" + this);
    }
}
