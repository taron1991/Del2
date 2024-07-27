package com.example.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class COnt {

    private final Rep rep;

    @PostMapping("/save")
    public void save(@RequestBody Carf carf){
        rep.save(carf);
    }

    @GetMapping("/all")
    public List<Carf> cArList(){
        return rep.findAll();
    }
}
