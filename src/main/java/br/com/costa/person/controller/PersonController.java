package br.com.costa.person.controller;

import br.com.costa.person.dto.PersonDTO;
import br.com.costa.person.entity.Person;
import br.com.costa.person.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonRepository repository;

    @GetMapping
    public List<Person> listAll() {
        return repository.findAll();
    }
}
