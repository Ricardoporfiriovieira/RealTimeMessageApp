package com.ricardoporfirio.RealTimeMessageApp.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ricardoporfirio.RealTimeMessageApp.models.MessageModel;



public interface MessageRepository extends MongoRepository<MessageModel, String> {
    
    @Query("{name:'?0'}")
    MessageModel findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<MessageModel> findAll(String category);
    
    public long count();


}