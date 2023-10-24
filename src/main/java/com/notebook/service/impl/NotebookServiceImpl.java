package com.notebook.service.impl;

import com.notebook.dao.NotebookDao;
import com.notebook.domain.Notebook;
import com.notebook.service.NotebookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class NotebookServiceImpl implements NotebookService {

    NotebookDao dao;

    @Override
    public void save(Notebook notebook) {
        dao.save(notebook);
    }

    @Override
    public void update(Notebook notebook) {
        dao.save(notebook);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public Notebook findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Notebook> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Notebook> findByModel(String model) {
        return dao.findAllByModel(model);
    }

    @Override
    public List<Notebook> findByDate(LocalDate date) {
        return dao.findAllByDate(date);
    }

    @Override
    public List<Notebook> findByRamAndSsd(int ram, int ssd) {
        return dao.findAllByRamAndSsd(ram, ssd);
    }

    @Override
    public List<Notebook> findByProcessor(String cpu) {
        return dao.findAllByProcessor(cpu);
    }

    @Override
    public void deleteAll() {

    }
}
