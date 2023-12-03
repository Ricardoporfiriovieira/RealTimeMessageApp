package com.ricardoporfirio.RealTimeMessageApp.models;

import java.time.ZonedDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ricardoporfirio.RealTimeMessageApp.dto.MessageDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;


@Document(collection = "message")
@NoArgsConstructor
@Getter
public class MessageModel {

    

        @Id
        private String id;

        private String message;
        private String messageSender;
        private ZonedDateTime time;
        
        public MessageModel(MessageDTO message) {
            super();
            this.message = message.body_message();
            this.messageSender = message.messageSender();
        }
}