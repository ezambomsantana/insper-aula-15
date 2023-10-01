package com.insper.partida.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/status")
    public String status() {
        return "OK";
    }
}
