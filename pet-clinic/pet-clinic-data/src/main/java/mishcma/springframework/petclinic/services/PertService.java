package mishcma.springframework.petclinic.services;

import mishcma.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PertService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
