package com.example.hair;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
@Service
public class HairService {
    // private final Repository repository;

    // public Service(Repository repository){
    //     this.repository=repository;
    // }

    List<Hair>hairlist= new ArrayList<>();

    public List<Hair> getHair(){
        return hairlist;
    }

    public void addHair(Hair hair){
        hairlist.add(hair);
    }

    public void updateHair(Hair hair){
        hairlist.removeIf(c->c.getId().equals(hair.getId()));
        hairlist.add(hair);
    }

    public void deleteHair(Integer id){
        hairlist.removeIf(c->c.getId().equals(id));

    }

    @PostConstruct
    public void init(){
       Hair h=new Hair(1, "braids", 100.00, 1.15);
       hairlist.add(h);
    }
}
