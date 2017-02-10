package com.pillartechnology.guru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by erinbergman on 2/7/17.
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    String index() {
        return "index";
    }

}
