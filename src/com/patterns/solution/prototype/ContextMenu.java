package com.patterns.solution.prototype;

public class ContextMenu {
    private Presentation presentation;

    public ContextMenu(Presentation presentation) {
        this.presentation = presentation;
    }

    public void duplicate(Component component) {
        var newComponent = component.clone();
        presentation.add(newComponent);
    }
}
