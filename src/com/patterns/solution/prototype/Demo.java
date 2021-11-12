package com.patterns.solution.prototype;

public class Demo {
    public static void show() {
        var presentation = new Presentation();
        var text = new TextBox("Hello");
        presentation.add(text);

        var menu = new ContextMenu(presentation);
        menu.duplicate(text);
    }
}
