package com.example.blad1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Zadanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long task_id;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn(name = "pracownik_id")
    private Pracownik pracownik;


}
