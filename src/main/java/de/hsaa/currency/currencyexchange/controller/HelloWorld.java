package de.hsaa.currency.currencyexchange.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping()
    public ResponseEntity<String> getExchange() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
