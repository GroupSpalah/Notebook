package com.notebook.controller;

import com.notebook.domain.Producer;
import com.notebook.service.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producers")
@AllArgsConstructor
public class ProducerController {
    CrudService<Producer> service;

    @PostMapping
    public void save(@RequestBody Producer producer) {
        service.save(producer);
    }

    @PutMapping
    public void update(@RequestBody Producer producer) {
        service.save(producer);
    }

    @GetMapping("/{id}")
    public Producer findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Producer> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }

}
