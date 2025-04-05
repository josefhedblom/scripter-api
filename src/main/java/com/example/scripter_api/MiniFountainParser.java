package com.example.scripter_api;

import java.util.*;

public class MiniFountainParser {

    public List<Element> parse(String input) {
        List<Element> elements = new ArrayList<>();
        String[] lines = input.split("\\r?\\n");
        Element lastCharacter = null;

        for (String rawLine : lines) {
            String line = rawLine.trim();
            if (line.isEmpty()) continue;

            if (line.matches("^(INT|EXT|EST)\\..*")) {
                elements.add(new Element(ElementType.SCENE_HEADING, line));
            } else if (line.matches("^\\(.*\\)$")) {
                elements.add(new Element(ElementType.PARENTHETICAL, line));
            } else if (line.equals(line.toUpperCase()) && line.length() <= 30) {
                lastCharacter = new Element(ElementType.CHARACTER, line);
                elements.add(lastCharacter);
            } else if (lastCharacter != null) {
                elements.add(new Element(ElementType.DIALOGUE, line));
                lastCharacter = null;
            } else {
                elements.add(new Element(ElementType.ACTION, line));
            }
        }

        return elements;
    }
}

