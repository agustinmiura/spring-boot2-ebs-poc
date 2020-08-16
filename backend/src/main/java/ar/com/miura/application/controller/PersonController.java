package ar.com.miura.application.controller;

import ar.com.miura.application.dto.PersonDto;
import ar.com.miura.application.entity.Person;
import ar.com.miura.application.repository.PersonRepository;
import ar.com.miura.application.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public List<PersonDto> listUsers() {
        return personService.list();
    }

}
