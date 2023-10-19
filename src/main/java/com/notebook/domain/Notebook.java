package com.notebook.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notebook {
    @Id
    @GeneratedValue
    @Column(name = "notebook_id")
    int id;

    String model;

    @ManyToOne
    @JoinColumn(name = "FK_Notebook_Producer")
    Producer producer;

    LocalDate date;

    int ram;

    int ssd;

    String processor;
}
