package com.notebook.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Producer {

    @Id
    @GeneratedValue
    @Column(name = "notebook_id")
    int id;

    @Enumerated(EnumType.STRING)
    ProdcuerName name;
}
