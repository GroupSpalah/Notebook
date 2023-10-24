package com.notebook.service;

import com.notebook.dao.CrudDAO;
import com.notebook.domain.Notebook;

import java.time.LocalDate;
import java.util.List;

public interface NotebookService extends CrudService<Notebook> {
    List<Notebook> findByModel(String model);
    List<Notebook> findByDate(LocalDate date);
    List<Notebook> findByRamAndSsd(int ram, int ssd);
    List<Notebook> findByProcessor(String cpu);
}
