package it.sirfin.ScuolaJPA.service;

import it.sirfin.ScuolaJPA.model.Docente;
import java.util.List;

public interface ScuolaJPAService {

    void inserisciDocente(Docente doc);

    void svuotaTabellaDocente();

    List<Docente> trovaTuttiIDocenti();

    void cancellaDocente(Docente doc);
}
