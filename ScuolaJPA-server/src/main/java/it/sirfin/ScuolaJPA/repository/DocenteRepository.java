package it.sirfin.ScuolaJPA.repository;

import it.sirfin.ScuolaJPA.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
    
}
