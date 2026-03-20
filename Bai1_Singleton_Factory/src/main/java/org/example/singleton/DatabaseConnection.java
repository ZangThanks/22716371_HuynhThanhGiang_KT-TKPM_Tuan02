package org.example.singleton;

import java.io.Serial;
import java.io.Serializable;

public class DatabaseConnection implements Serializable {
    private static class DatabaseHelper {
        static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    private DatabaseConnection() {
        System.out.println("Connection Created");
    }

    public static DatabaseConnection getInstance() {
        return DatabaseHelper.INSTANCE;
    }

    @Serial
    private Object readResolve() {
        return DatabaseHelper.INSTANCE;
    }
}
