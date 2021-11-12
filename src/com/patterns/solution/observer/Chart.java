package com.patterns.solution.observer;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated and fetched the data using the pull mechanism: : " + dataSource.getValue());
    }
}
