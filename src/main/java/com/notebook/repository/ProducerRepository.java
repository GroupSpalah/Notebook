package com.notebook.repository;

import com.notebook.domain.Notebook;
import com.notebook.domain.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository<Producer, Integer> {
}
