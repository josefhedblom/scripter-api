package com.example.scripter_api;

import java.util.*;

public class HtmlFormatter {

    public String formatToHtml(List<Element> elements) {
        StringBuilder html = new StringBuilder();

        html.append("""
            <html>
            <head>
                <style>
                .preview { font-family: Courier; margin: 2em auto; background: #fffef8; padding: 1.5em; border: 1px solid #ccc; color:#000; }
                    .scene { text-transform: uppercase; font-weight: bold; margin-top: 30px; }
                    .action { margin: 10px 0; }
                    .character { text-align: center; margin-top: 20px; font-weight: bold; }
                    .parenthetical { text-align: center; font-style: italic; }
                    .dialogue { text-align: center; margin-bottom: 20px; }
                </style>
            </head>
            <body>
        """);

        for (Element e : elements) {
            switch (e.getType()) {
                case SCENE_HEADING -> html.append("<div class='scene'>").append(e.getText()).append("</div>");
                case ACTION -> html.append("<div class='action'>").append(e.getText()).append("</div>");
                case CHARACTER -> html.append("<div class='character'>").append(e.getText()).append("</div>");
                case PARENTHETICAL -> html.append("<div class='parenthetical'>").append(e.getText()).append("</div>");
                case DIALOGUE -> html.append("<div class='dialogue'>").append(e.getText()).append("</div>");
            }
        }

        html.append("</body></html>");
        return html.toString();
    }
}

