package com.patterns.solution.prototype;

public class TextBox implements Component {
    private String value;

    public TextBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public Component clone() {
        System.out.println("Duplicating TextBox: " + value);
        return new TextBox(value);
    }

    @Override
    public void render() {
        System.out.println("Rendering a Textbox");
    }
}
