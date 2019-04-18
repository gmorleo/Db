package it.unisalento.db.crud.Iservice;

import it.unisalento.db.crud.DTO.PersonaDTO;
import it.unisalento.db.crud.domain.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> getAll();
    public Persona getById(int id);
    public Persona update(PersonaDTO personaDTO);
    public Persona save(PersonaDTO personaDTO);
    public Persona deleteById(int id);
}
