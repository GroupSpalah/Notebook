package com.notebook.repository;

import com.notebook.domain.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface NotebookRepository extends JpaRepository<Notebook, Integer> {
    List<Notebook> findAllByModel(String model);
    List<Notebook> findAllByDate(LocalDate date);
    List<Notebook> findAllByRamAndSsd(int ram, int ssd);
    List<Notebook> findAllByProcessor(String cpu);
}
