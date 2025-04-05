package com.example.scripter_api;

public class Element {
    private ElementType type;
    private String text;

    public Element(ElementType type, String text) {
        this.type = type;
        this.text = text;
    }

    public ElementType getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}

