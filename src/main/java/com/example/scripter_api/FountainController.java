package com.example.scripter_api;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/fountain")
public class FountainController {

    @PostMapping("/parse")
    public String parseFountain(@RequestBody String text) {
        MiniFountainParser parser = new MiniFountainParser();
        HtmlFormatter formatter = new HtmlFormatter();

        List<Element> elements = parser.parse(text);
        return formatter.formatToHtml(elements);
    }
}
