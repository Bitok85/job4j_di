package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru/job4j/di");
        context.refresh();

        StartUI ui = context.getBean(StartUI.class);

        ui.addValue("Kot Matroskin");
        ui.addValue("Ivan ivanov");
        ui.print();
        ui.askStr("what's up?");
        context.close();
    }
}


