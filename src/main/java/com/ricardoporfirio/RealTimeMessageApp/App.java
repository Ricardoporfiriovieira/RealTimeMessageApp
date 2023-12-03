package com.ricardoporfirio.RealTimeMessageApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.ricardoporfirio.RealTimeMessageApp.models.MessageModel;
import com.ricardoporfirio.RealTimeMessageApp.repositories.MessageRepository;

@Controller
public class App {

    @Autowired
    MessageRepository messageRepository;

    @MessageMapping("/chatMessage")
    @SendTo("/canal")
    public MessageModel sendMessage(MessageModel message){
        messageRepository.save(message);
        return message;
    }

    @MessageMapping("/getMessages")
    @SendTo("/canal")
    public List<MessageModel> getMessages() {
        // Recupera todas as mensagens do banco de dados
        return messageRepository.findAll();
    }

}