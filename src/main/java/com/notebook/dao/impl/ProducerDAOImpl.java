package com.notebook.dao.impl;

import com.notebook.dao.CrudDAO;
import com.notebook.domain.Producer;
import com.notebook.repository.NotebookRepository;
import com.notebook.repository.ProducerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class ProducerDAOImpl implements CrudDAO<Producer> {

    ProducerRepository repository;
    NotebookRepository notebookRepository;

    @Override
    public void save(Producer producer) {
        repository.save(producer);
    }

    @Override
    public void update(Producer producer) {
        repository.save(producer);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Producer findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Producer> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
