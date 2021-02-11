package it.sirfin.ScuolaJPA.service.impl;

import it.sirfin.ScuolaJPA.model.Docente;
import it.sirfin.ScuolaJPA.repository.DocenteRepository;
import it.sirfin.ScuolaJPA.service.ScuolaJPAService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class ScuolaJPAServiceImpl implements ScuolaJPAService {

    @Autowired
    DocenteRepository docenteRepository;
    
    @Override
    public void inserisciDocente(Docente doc) {
        docenteRepository.save(doc);
    }

    @Override
    public void svuotaTabellaDocente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Docente> trovaTuttiIDocenti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancellaDocente(Docente doc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
