package it.sirfin.ScuolaJPA.service.impl;

import it.sirfin.ScuolaJPA.model.Docente;
import it.sirfin.ScuolaJPA.repository.DocenteRepository;
import it.sirfin.ScuolaJPA.service.ScuolaJPAService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScuolaJPAServiceImpl implements ScuolaJPAService {

    @Autowired
    DocenteRepository docenteRepository;
    
    @Override
    public void inserisciDocente(Docente doc) {
        docenteRepository.save(doc);
    }

    @Override
    public void svuotaTabellaDocente() {
        docenteRepository.deleteAllInBatch();
    }

    @Override
    public List<Docente> trovaTuttiIDocenti() {
        return docenteRepository.findAll();
    }

    @Override
    public void cancellaDocente(Docente doc) {
        docenteRepository.delete(doc);
    }
    
}
