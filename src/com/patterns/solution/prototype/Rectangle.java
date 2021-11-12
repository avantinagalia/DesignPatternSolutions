package com.patterns.solution.prototype;

public class Rectangle implements Component {
    @Override
    public Component clone() {
        System.out.println("Duplicating a Rectangle: ");
        return new Rectangle();
    }

    @Override
    public void render() {
        System.out.println("Rendering a Rectangle");
    }
}
