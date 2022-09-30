package com.mintic.retoBike.bike3.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.retoBike.bike3.model.Message;
import com.mintic.retoBike.bike3.service.ServiceMessage;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/api/Message")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ControllerMessage {
    
    @Autowired
    private ServiceMessage serviceMessage;

    
    @GetMapping("/all")
    public List<Message> getAll(){
        return serviceMessage.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") int id) {
        return serviceMessage.getMessage(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message) {
        return serviceMessage.save(message);
    }
}
