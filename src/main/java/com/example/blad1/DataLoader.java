package com.example.blad1;

import com.example.blad1.PracownikRepo;
import com.example.blad1.Zadanie;
import com.example.blad1.ZadanieRepo;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {
    private ZadanieRepo zadanieRepo;

    private PracownikRepo pracownikRepo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Pracownik pracownik = new Pracownik();
        pracownik.setId(1L);
        pracownik.setName("name");
        pracownikRepo.save(pracownik);

        Zadanie zadanie = new Zadanie();
        zadanie.setTask_id(1L);
        zadanie.setTitle("title");
        zadanie.setPracownik(pracownik);
        zadanieRepo.save(zadanie);
    }
}
