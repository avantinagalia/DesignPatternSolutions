package com.patterns.solution.singleton;

public class Demo {
    public static void show() {
        ConfigurationManager manager = ConfigurationManager.getInstance();
        manager.set("fontSize", "10");

        ConfigurationManager other = ConfigurationManager.getInstance();
        System.out.println(manager.get("fontSize"));
    }
}
