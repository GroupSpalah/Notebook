package com.notebook.dao;

import com.notebook.domain.Notebook;

import java.time.LocalDate;
import java.util.List;

public interface NotebookDao extends CrudDAO<Notebook> {
    List<Notebook> findAllByModel(String model);
    List<Notebook> findAllByDate(LocalDate date);
    List<Notebook> findAllByRamAndSsd(int ram, int ssd);
    List<Notebook> findAllByProcessor(String cpu);
}
