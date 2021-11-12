package com.patterns.solution.observer;

public class Demo {
    public static void show() {
        DataSource dataSource = new DataSource();
        dataSource.addObserver(new Chart(dataSource));
        dataSource.addObserver(new SpreadSheet(dataSource));
        dataSource.setValue(6);
    }
}
