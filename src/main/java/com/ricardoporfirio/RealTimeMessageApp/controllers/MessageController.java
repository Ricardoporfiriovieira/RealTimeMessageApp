package com.ricardoporfirio.RealTimeMessageApp.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ricardoporfirio.RealTimeMessageApp.dto.MessageDTO;
import com.ricardoporfirio.RealTimeMessageApp.models.MessageModel;
import com.ricardoporfirio.RealTimeMessageApp.repositories.MessageRepository;

import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/list-all")
    ResponseEntity<List<MessageModel>> getMessage(){

        List<MessageModel> messageObjects = messageRepository.findAll();
        return ResponseEntity.ok(messageObjects);
    }

    @PostMapping("/send")
    String sendMessage(@RequestBody @Valid MessageDTO message){
        MessageModel messageObject = new MessageModel(message);
        messageRepository.save(messageObject);
        return "ok";
    }

}
