package com.example.demo61.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("hi")
    public ResponseEntity hi(@RequestParam String s) {
        System.out.println("bug really fixed!");
        return ResponseEntity.ok("demo61 hi " + s);
    }

    @GetMapping("hello")
    public ResponseEntity hello(@RequestParam String s) {
        return ResponseEntity.ok("demo61 hello " + s);
    }

    @PostMapping("create")
    public ResponseEntity create(@RequestParam String name,@RequestParam Integer age) {
        return ResponseEntity.ok("hello " + name + ", 年龄" + age);
    }
}
