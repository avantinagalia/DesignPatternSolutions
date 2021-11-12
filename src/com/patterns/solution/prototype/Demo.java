package com.patterns.solution.prototype;

public class Demo {
    public static void show() {
        var slide = new Presentation();
        var text = new TextBox("Hello");
        slide.add(text);

        var menu = new ContextMenu(slide);
        menu.duplicate(text);
    }
}
