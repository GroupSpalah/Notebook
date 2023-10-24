package com.notebook.service;

import java.util.List;

public interface CrudService<T> {
    void save(T t);
    void update(T t);
    void deleteById(int id);
    void deleteAll();
    T findById(int id);
    List<T> findAll();
}
