package com.globallabs.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import com.globallabs.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

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

    
}