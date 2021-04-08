package com.globallabs.springwebmvc.repository;

import com.globallabs.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class JediRepository {
    
    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi(){

        return this.jedi;
    }

    public void add( final Jedi jedi) {

        this.jedi.add(jedi);
    }

    public List<Jedi> findAll() {
        return null;
    }

    public Optional<Jedi> findById(Long id) {
        return null;
    }

    public Jedi save(Jedi jedi2) {
        return null;
    }

    public void delete(Jedi jedi2) {
    }

    public Object findByNameContainingIgnoreCase(String name) {
        return null;
    }



}
