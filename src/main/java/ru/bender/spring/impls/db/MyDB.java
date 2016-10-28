package ru.bender.spring.impls.db;

import ru.bender.spring.interfaces.Database;

/**
 * Created by bender on 27.10.16.
 */
public class MyDB implements Database {
    public MyDB() {
        testConnection();
    }

    private void testConnection() {
        System.out.println("Test connection");
    }
}
