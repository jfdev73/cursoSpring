package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;

import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class ControllerInicio {
    @Autowired
    private PersonaDao personaDao;

  @GetMapping("/")
  public String incio(Model model) {
      var personas = personaDao.findAll();
      //Iterable<Persona> personas1 = personaDao.findAll();
//    String mensaje = "Hola mundo con thymeleaf";
//    Persona persona = new Persona();
//    persona.setNombre("Juan");
//    persona.setApellido("Miranda");
//    persona.setEmail("juan@mail.com");
//    persona.setTelefono("3525235235");
//
//    Persona persona2 = new Persona();
//    persona2.setNombre("Fernando");
//    persona2.setApellido("Monroy");
//    persona2.setEmail("fer@mail.com");
//    persona2.setTelefono("83462336");
//
//    List<Persona> personas = Arrays.asList(persona,persona2);
//
//    model.addAttribute("mensaje", mensaje);
//    //model.addAttribute("persona", persona);
      model.addAttribute("personas", personas);
//    // log.info("Ejecuntado el controlador spring MVC");
 return "index";
  }
}
