package com.patterns.solution.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private Map<String, Object> settings = new HashMap<>();
    private static ConfigurationManager instance = new ConfigurationManager();

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}
