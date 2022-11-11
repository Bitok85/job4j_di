package ru.job4j.di;

import java.util.List;

public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void addValue(String value) {
        store.add(value);
    }

    public void print() {
        store.getAll().forEach(System.out::println);
    }

    public String askStr(String question) {
        return consoleInput.askStr(question);
    }
}
