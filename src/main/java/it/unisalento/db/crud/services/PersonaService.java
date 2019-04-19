package it.unisalento.db.crud.services;

import it.unisalento.db.crud.DTO.PersonaDTO;
import it.unisalento.db.crud.Iservice.IPersonaService;
import it.unisalento.db.crud.domain.Persona;
import it.unisalento.db.crud.exceptions.PersonaNotFoundException;
import it.unisalento.db.crud.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Transactional
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Transactional
    public Persona getById(int id) {
        return personaRepository.getById(id);
    }

    @Override
    public Persona deleteById(int id) {
        return personaRepository.deleteById(id);
    }

    @Transactional
    public Persona update(PersonaDTO personaDTO) {
        Persona p = personaRepository.getById(personaDTO.getId());
        if ( p == null)
            try {
                throw new PersonaNotFoundException();
            } catch (PersonaNotFoundException e) {
                System.out.println(e.getMessage());
                return null;
            }
        p.setCitta(personaDTO.getCitta());
        p.setIndirizzo(personaDTO.getIndirizzo());
        p.setProvincia(personaDTO.getProvincia());
        return personaRepository.save(p);
    }

    @Transactional
    public Persona save(PersonaDTO p) {
        System.out.println(p.getCognome());

        Persona persona = new Persona(
                p.getNome(),
                p.getCognome(),
                p.getDob(),
                p.getIndirizzo(),
                p.getCitta(),
                p.getProvincia()
        );

        return personaRepository.save(persona);
    }

}
