package it.unisalento.db.crud.restapi;

import it.unisalento.db.crud.DTO.PersonaDTO;
import it.unisalento.db.crud.Iservice.IPersonaService;
import it.unisalento.db.crud.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaRestController {

    @Autowired
    IPersonaService personaService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Persona> getAll() {
        return personaService.getAll();
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Persona getById(@PathVariable("id") int id) {
        return personaService.getById(id);
    }

    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Persona deleteById(@PathVariable("id") int id) {
        return personaService.deleteById(id);
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Persona save(@RequestBody PersonaDTO personaDTO) {
        return personaService.save(personaDTO);
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Persona update(@RequestBody PersonaDTO personaDTO) {
        return personaService.update(personaDTO);
    }
}
