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

import com.mintic.retoBike.bike3.model.Client;
import com.mintic.retoBike.bike3.service.ServiceClient;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/api/Client")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ControllerClient {
    
    @Autowired
    private ServiceClient serviceClient;

    
    @GetMapping("/all")
    public List<Client> getAll(){
        return serviceClient.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClient(@PathVariable("id") int id) {
        return serviceClient.getClient(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client) {
        return serviceClient.save(client);
    }
}
