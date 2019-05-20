package com.ness;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

        @RequestMapping("/")
        public String greeting()
        {
            return " <H1>Hello chandra</H1>";
        }

}
