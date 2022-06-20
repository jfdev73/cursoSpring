package mx.com.gm.service;

import mx.com.gm.domain.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona findPersona(Persona persona);

}
