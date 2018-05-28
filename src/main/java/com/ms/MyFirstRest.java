package com.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GulsahCoskun on 28.05.2018.
 */
@RestController
public class MyFirstRest {

    @GetMapping("/hello/{isim}")
    public String hello(@PathVariable("isim") String name, @RequestParam("soy") String surname){
        return "Hello World " + name + " " + surname;
    }

}
