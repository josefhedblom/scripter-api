package com.example.scripter_api;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ParserController {

    @PostMapping("/parse")
    public String parseFountain(@RequestBody String text) {
        MiniParser parser = new MiniParser();
        HtmlFormatter formatter = new HtmlFormatter();

        List<Element> elements = parser.parse(text);
        return formatter.formatToHtml(elements);
    }
}
