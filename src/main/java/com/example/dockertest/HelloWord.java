package com.example.dockertest;

//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping()
public class HelloWord {
@GetMapping
    public String GetText(){ return "Hello World! Lalala";}
}
