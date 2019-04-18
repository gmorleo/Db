package it.unisalento.db.crud.repositories;

import it.unisalento.db.crud.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    public Persona getById(int id);
    public Persona deleteById(int id);
}
