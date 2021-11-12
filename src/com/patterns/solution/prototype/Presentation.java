package com.patterns.solution.prototype;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }
}
