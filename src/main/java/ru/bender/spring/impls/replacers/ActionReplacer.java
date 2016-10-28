package ru.bender.spring.impls.replacers;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by bender on 28.10.16.
 */
public class ActionReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(o.toString() + " - text from methodReplacer");
        return null;
    }
}
