package usil2026.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import usil2026.demo.Model.PersonaEntity;
import usil2026.demo.Service.PersonaService;

import java.util.ArrayList;
import java.util.List;
@RestController
public class PersonaController {

@Autowired
private PersonaService service;


    @GetMapping("/listar")
    public List<PersonaEntity> listar_personas(){

        List<PersonaEntity> lista = new ArrayList<PersonaEntity>();

        lista = service.listar();

        return lista;
    }



}
