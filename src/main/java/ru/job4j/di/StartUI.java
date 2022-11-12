package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput consoleInput;
    public void setConsoleInput(ConsoleInput consoleInput) {
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
