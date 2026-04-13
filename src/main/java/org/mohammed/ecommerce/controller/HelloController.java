package org.mohammed.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{id}")
    public ResponseController getResponse(@PathVariable String id )
    {
        return new ResponseController("hello world " + id);
    }
    @PostMapping ("/hello")
    public String getName(@RequestBody String name)
    {
        return "Hello "+name;
    }

}
