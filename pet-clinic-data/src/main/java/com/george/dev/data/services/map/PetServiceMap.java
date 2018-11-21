package com.george.dev.data.services.map;

import com.george.dev.data.services.PetService;
import com.george.dev.data.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by George on 15/11/2018
 */

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet owner) {
        return super.save( owner);
    }

    @Override
    public void delete(Pet owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
