package it.sirfin.ScuolaJPA.controller;

import it.sirfin.ScuolaJPA.model.Docente;
import it.sirfin.ScuolaJPA.service.ScuolaJPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ScuolaJPAController {

    @Autowired
    ScuolaJPAService scuolaJPAService;

    @RequestMapping("/initialize")
    public void init() {
        scuolaJPAService.svuotaTabellaDocente();
        scuolaJPAService.inserisciDocente(new Docente("Felice", "Sposito"));
        scuolaJPAService.inserisciDocente(new Docente("Daniele", "Fastelli"));
        scuolaJPAService.inserisciDocente(new Docente("Matteo", "Moretti"));
        scuolaJPAService.inserisciDocente(new Docente("Nicolò", "Abbatecola"));       
    }
    
    @RequestMapping("/deletealldocente")
    public void deleteAllDocente() {
        scuolaJPAService.svuotaTabellaDocente();
    }
}
