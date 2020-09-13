package com.example.demo.Servicio;

import com.example.demo.Entidad.Persona;
import com.example.demo.Repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Servicio {

    @Autowired
    private Repositorio repositorio;



    public List<Persona> devolverTodos(Pageable pageable) {

        /* devolver lista devuelta por el JPARepository
        List<Persona> lista = repositorio.findAll();
        return lista;
        //*/
        /* filtrar lista que trae el repositorio
        List<Persona> lista = repositorio.findAll();
        List<Persona> listaFinal= lista.stream().filter(x -> x.getApellidos().equals("Gates") ).collect(Collectors.toList());
        return listaFinal;
        */
        // /* filtrar lista que trae el repositorio y que se puede paginar*/
        //Pageable paging = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by(pageable.getSort().toString()));
        Pageable paging = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());
        Page<Persona> lista = repositorio.findAll(paging);
        List<Persona> listaFinal= lista.stream().filter(x -> x.getApellidos().equals("Gates") ).collect(Collectors.toList());
        return listaFinal;
        //*/

    }
}
/*
 public List<EmployeeEntity> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<EmployeeEntity> pagedResult = repository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<EmployeeEntity>();
        }
    }


List<Customer> customersWithMoreThan100Points = customers
  .stream()
  .filter(c -> c.getPoints() > 100)
  .collect(Collectors.toList());


    @Service
    public class GreetingServiceBean implements GreetingService {

        @Autowired
        private GreetingRepository greetingRepository;

        @Override
        public Collection<Greeting> findAll() {
            Collection<Greeting> greetings = greetingRepository.findAll();
            return greetings;
        }

        @Override
        public Greeting findOne(Long id) {
            Greeting greeting = greetingRepository.findOne(id);
            return greeting;
        }

        @Override
        public Greeting create(Greeting greeting) {
            if (greeting.getId() != null) {
                //cannot create Greeting with specified Id value
                return null;
            }
            Greeting savedGreeting = greetingRepository.save(greeting);
            return savedGreeting;
        }

        @Override
        public Greeting update(Greeting greeting) {
            Greeting greetingPersisted = findOne(greeting.getId());
            if (greetingPersisted == null) {
                //cannot find Greeting with specified Id value
                return null;
            }
            Greeting updatedGreeting = greetingRepository.save(greeting);
            return updatedGreeting;
        }

        @Override
        public void delete(Long id) {
            greetingRepository.delete(id);
        }

    }
    */



