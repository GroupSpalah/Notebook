package com.notebook.controller;

import com.notebook.domain.Notebook;
import com.notebook.domain.Producer;
import com.notebook.dto.NotebookDto;
import com.notebook.service.CrudService;
import com.notebook.service.NotebookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/notebooks")
@AllArgsConstructor
public class NotebookController {
    NotebookService service;

    @PostMapping
    public void save(@RequestBody Notebook notebook) {
        service.save(notebook);
    }

    @PutMapping
    public void update(@RequestBody Notebook notebook) {
        service.save(notebook);
    }

    @GetMapping("/{id}")
    public Notebook findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @GetMapping("/ram/ssd")
    public List<Notebook> findByRamSsd(@RequestBody NotebookDto dto) {
        return service.findByRamAndSsd(dto.getRam(), dto.getSsd());
    }

    @GetMapping("/model/{model}")
    public List<Notebook> findByModel(@PathVariable("model") String model) {
        return service.findByModel(model);
    }
    @GetMapping("/date/{date}")
    public List<Notebook> findByDate(@PathVariable("date") LocalDate date) {
        return service.findByDate(date);
    }

    @GetMapping("/processor/{cpu}")
    public List<Notebook> findByCpu(@PathVariable("cpu") String cpu) {
        return service.findByProcessor(cpu);
    }

    @GetMapping("/all")
    public List<Notebook> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        service.deleteAll();
    }

}
