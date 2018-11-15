package com.george.dev.sftpetclinic.services.map;

import com.george.dev.sftpetclinic.model.Pet;
import com.george.dev.sftpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by George on 15/11/2018
 */

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

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
        return super.save(owner.getId(), owner);
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
