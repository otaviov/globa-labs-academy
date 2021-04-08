package com.globallabs.springwebmvc.rest;

import java.util.List;

import javax.validation.Valid;

import com.globallabs.springwebmvc.model.Jedi;
import com.globallabs.springwebmvc.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class JediResource {

    @Autowired
    private JediRepository repository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi() {

        return repository.findAll();

    }

    @GetMapping("/api/jedi/{id}")
    public Jedi getJedi(@PathVariable("id") Long id){
        final Optional<Jedi> jedi = repository.findById(id).get();
        if(jedi.isPresent()){
            return jedi.get();
        }else{
            throw new JediNotFoundException();
        }
        return jedi.get();
    }

}
