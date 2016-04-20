package com.epam.tamentoring.m7w2.worklogger.model;
import java.util.Scanner;

public class Credentials {
    static String username;
    static String password;

    public Credentials(String username, String password) {
        Credentials.username = username;
        Credentials.password = password;
    }

    public static Credentials readFromConsole() {
        //hint: put code here to read from console

        // --- hw ---
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();
        // --- /hw ---

        return new Credentials(username, password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
