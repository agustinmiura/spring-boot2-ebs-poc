package ar.com.miura.application.repository;

import ar.com.miura.application.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {}

