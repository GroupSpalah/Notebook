package com.notebook.dao.impl;

import com.notebook.dao.NotebookDao;
import com.notebook.domain.Notebook;
import com.notebook.repository.NotebookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class NotebookDAOImpl implements NotebookDao {

    NotebookRepository repository;

    @Override
    public void save(Notebook notebook) {
        repository.save(notebook);
    }

    @Override
    public void update(Notebook notebook) {
        repository.save(notebook);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Notebook findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Notebook> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Notebook> findAllByModel(String model) {
        return repository.findAllByModel(model);
    }

    @Override
    public List<Notebook> findAllByDate(LocalDate date) {
        return repository.findAllByDate(date);
    }

    @Override
    public List<Notebook> findAllByRamAndSsd(int ram, int ssd) {
        return repository.findAllByRamAndSsd(ram, ssd);
    }

    @Override
    public List<Notebook> findAllByProcessor(String cpu) {
        return repository.findAllByProcessor(cpu);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
