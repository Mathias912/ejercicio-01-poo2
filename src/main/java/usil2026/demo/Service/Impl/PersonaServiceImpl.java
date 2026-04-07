package usil2026.demo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usil2026.demo.Model.PersonaEntity;
import usil2026.demo.Repository.PersonaRepository;
import usil2026.demo.Service.PersonaService;

import javax.jnlp.PersistenceService;
import java.util.Collections;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repository;


    @Override
    public List<PersonaEntity> listar() {

       return repository.findAll();

    }
}
