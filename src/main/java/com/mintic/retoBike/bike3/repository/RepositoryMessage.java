package com.mintic.retoBike.bike3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mintic.retoBike.bike3.model.Message;
import com.mintic.retoBike.bike3.repository.crud.CrudRepositoryMessage;

@Repository
public class RepositoryMessage {

    @Autowired
    private CrudRepositoryMessage crudRepositoryMessage;

    
    public List<Message> getAll(){
        return (List<Message>) crudRepositoryMessage.findAll();
    }
    public Optional<Message> getMessage(int id){
        return crudRepositoryMessage.findById(id);
    }
    
    public Message save(Message message){
        return crudRepositoryMessage.save(message);
    }
}
