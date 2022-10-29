package com.tutoria.demo.web;

import com.tutoria.demo.model.Papeleria;
import com.tutoria.demo.service.PapeleriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Papeleria")
public class PapeleriaController {
@Autowired
    private PapeleriaService papeleriaService;
@GetMapping("/all")
    public List<Papeleria>getPapelerias(){
        return papeleriaService.getAll();

    }
    @GetMapping("/{id}")
    public Optional<Papeleria> getPapeleria(@PathVariable("id")int id){
    return papeleriaService.getPapeleria(id);

    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Papeleria save(@RequestBody Papeleria p){
   return papeleriaService.save(p);

    }
}
