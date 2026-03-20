package org.example;

import org.example.singleton.DatabaseConnection;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Test Multi-thread
        Runnable task = () -> {
            DatabaseConnection instance = DatabaseConnection.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

        //Test Serializable
        DatabaseConnection instance = DatabaseConnection.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.ser"));
        DatabaseConnection instance2 = (DatabaseConnection) ois.readObject();

        System.out.println(instance2 == instance);
    }
}