package pl.tomskr.manager_rozanca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomskr.manager_rozanca.model.GrupyRóżańca;

import java.util.Arrays;
import java.util.List;

@RestController
public class GrupyRóżańcaController {

    @RequestMapping("/grupy")
    public List<GrupyRóżańca> getWszyskieGrupyRóżańca(){

        return Arrays.asList(
                new GrupyRóżańca(1,"Matki Bożej"),
                new GrupyRóżańca(2,"św. Dusza"),
                new GrupyRóżańca(3,"św. Błażeja")
        );
    }
}
