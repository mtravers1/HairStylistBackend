package com.example.hair;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/")
@CrossOrigin

public class Controller {
    @Autowired
    private final HairService service;

    public Controller(HairService service){
        this.service=service;
    }
    @GetMapping("/")
    public List<Hair> getHair(){
        return service.getHair();
    }

    @PostMapping("/")
    public void addHair(@RequestBody Hair hair){
        service.addHair(hair);
    }

    @PutMapping("/{id}")
    public void updateHair(@RequestBody Hair hair, @PathVariable Integer id){
        service.updateHair(hair);
    }

    @DeleteMapping("/{id}")
    public void deleteHair(@PathVariable Integer id){
        service.deleteHair(id);
    }


    
}
