package com.notebook.service.impl;

import com.notebook.dao.CrudDAO;
import com.notebook.domain.Producer;
import com.notebook.service.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ProducerServiceImpl implements CrudService<Producer> {

    CrudDAO<Producer> dao;

    @Override
    public void save(Producer producer) {
        dao.save(producer);
    }

    @Override
    public void update(Producer producer) {
        dao.save(producer);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public Producer findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Producer> findAll() {
        return dao.findAll();
    }

    @Override
    public void deleteAll() {
        dao.deleteAll();
    }
}
