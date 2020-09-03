package br.com.costa.person.repository;

import br.com.costa.person.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByName(String name);
}
