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
    public void init(){
        scuolaJPAService.svuotaTabellaDocente();
        Docente d = new Docente("Felice", "Capponi");
        
    }
}
