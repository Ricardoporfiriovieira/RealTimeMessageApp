package com.ricardoporfirio.RealTimeMessageApp.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/message")
public class MessageController {

    @PostMapping("/send")
    String sendMessage(){
        return "dale";
    }

}
