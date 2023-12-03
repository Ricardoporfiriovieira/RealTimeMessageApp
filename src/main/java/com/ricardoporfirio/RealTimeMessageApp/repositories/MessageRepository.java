package com.ricardoporfirio.RealTimeMessageApp.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ricardoporfirio.RealTimeMessageApp.models.MessageModel;



public interface MessageRepository extends MongoRepository<MessageModel, String> {
    public long count();
}