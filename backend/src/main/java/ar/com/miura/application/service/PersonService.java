package ar.com.miura.application.service;

import ar.com.miura.application.dto.PersonDto;
import ar.com.miura.application.entity.Person;
import ar.com.miura.application.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<PersonDto> list() {
        return StreamSupport.stream(personRepository.findAll().spliterator(), false).map(Person::toDto).collect(Collectors.toList());

    }
}
