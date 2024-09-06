package com.limbo.ws_poc.controller;

import com.limbo.ws_poc.service.StubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final StubService stubService;

    public TestController(StubService stubService) {
        this.stubService = stubService;
    }

    @GetMapping
    public ResponseEntity<String> test() {
        System.out.println("Invoking subtract...");
        int a = 100;
        int b = 10;
        int result = stubService.soap().subtract(a, b);
        System.out.println("subtract.result=" + result);

        return ResponseEntity.ok(String.valueOf(result));
    }

    @GetMapping("/add")
    public ResponseEntity<String> add() {
        System.out.println("Invoking add...");
        int a = 100;
        int b = 10;
        int result = stubService.soap().add(a, b);
        System.out.println("add.result=" + result);

        return ResponseEntity.ok(String.valueOf(result));
    }

    @GetMapping("/multiply")
    public ResponseEntity<String> multiply() {
        System.out.println("Invoking multiply...");
        int a = 100;
        int b = 10;
        int result = stubService.soap().multiply(a, b);
        System.out.println("multiply.result=" + result);

        return ResponseEntity.ok(String.valueOf(result));
    }

    @GetMapping("/divide")
    public ResponseEntity<String> divide() {
        System.out.println("Invoking divide...");
        int a = 100;
        int b = 10;
        int result = stubService.soap().divide(a, b);
        System.out.println("divide.result=" + result);

        return ResponseEntity.ok(String.valueOf(result));
    }
}
