package dev.zerotwopocket.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @GetMapping
    public Message hello(){
        return new Message("hello, World!");
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Message{
        private String text;
    }
}
