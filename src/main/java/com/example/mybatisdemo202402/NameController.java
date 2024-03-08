package com.example.mybatisdemo202402;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService){
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<Name> findNames(NameSearchRequest request){
        List<Name> names = nameService.findNames(request.getStartsWith(), request.getEndsWith(), request.getContains());
        return names;
    }

    @GetMapping("/names/{id}")
    public Name getNames(@PathVariable("id") int id){
        return nameService.findNames(id);
    }
}
