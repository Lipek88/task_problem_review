package com.example.blad1;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class Controller {

    private PracownikRepo pracownikRepo;
    private ZadanieRepo zadanieRepo;

    @PostMapping("/addp")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void createPracownik(@RequestBody Pracownik pracownik) {
        pracownikRepo.save(pracownik);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void createZadanie(@RequestBody Zadanie zadanie) {
        zadanieRepo.save(zadanie);
    }

    @GetMapping("/list")
    public List<Zadanie> getZadania(){
        List<Zadanie> zadania = zadanieRepo.findAll();
        return zadania;
    }

}
