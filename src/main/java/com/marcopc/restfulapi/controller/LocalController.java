package com.marcopc.restfulapi.controller;

import com.marcopc.restfulapi.exception.LocalNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.marcopc.restfulapi.entity.Local;
import com.marcopc.restfulapi.service.LocalService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAllLocals")
    public List<Local> findAllLocals(){
        return localService.findAllLocals();
    }

    @PostMapping("/saveLocal")
    public Local saveLocal(@Valid @RequestBody Local local){
        return localService.saveLocal(local);
    }

    @PutMapping("/updateLocal/{id}")
    public Local updateLocal(@PathVariable Long id, @RequestBody Local local){
        return localService.updateLocal(id, local);
    }

    @DeleteMapping("/deleteLocal/{id}")
    public String deleteLocal(@PathVariable Long id){
        localService.deleteLocal(id);
        return "Successfully deleted";
    }

    @GetMapping("/findLocalByNameJPQL/{name}")
    Optional<Local> findLocalByNameJPQL(@PathVariable String name){
        return localService.findLocalByNameJPQL(name);
    }

    @GetMapping("/findLocalByName/{name}")
    Optional<Local> findLocalByName(@PathVariable String name){
        return localService.findByName(name);
    }

    @GetMapping("/findLocalByNameIgnoreCase/{name}")
    Optional<Local> findLocalByNameIgnoreCase(@PathVariable String name){
        return localService.findByNameIgnoreCase(name);
    }

    @GetMapping("/findLocalById/{id}")
    Local findLocalById(@PathVariable Long id) throws LocalNotFoundException {
        return localService.findLocalById(id);
    }

}
