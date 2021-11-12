package com.patterns.solution.prototype;

public class Image implements Component {
    @Override
    public Component clone() {
        System.out.println("Duplicating an Image");
        return new Image();
    }

    @Override
    public void render() {
        System.out.println("Rendering an Image");
    }
}
