package ru.job4j.di;

import java.util.Scanner;

public class ConsoleInput {
    private Scanner sc = new Scanner(System.in);

    public String askStr(String question) {
        System.out.println(question);
        return sc.nextLine();
    }
}
