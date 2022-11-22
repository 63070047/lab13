package com.lab13.Bookstore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookstore {
    @RequestMapping(value = "/recommended", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello Test";
    }

}
