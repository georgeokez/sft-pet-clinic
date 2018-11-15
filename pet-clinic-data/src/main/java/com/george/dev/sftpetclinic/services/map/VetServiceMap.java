package com.george.dev.sftpetclinic.services.map;

import com.george.dev.sftpetclinic.model.Vet;
import com.george.dev.sftpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by George on 15/11/2018
 */

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet Vet) {
        return super.save(Vet.getId(), Vet);
    }
    @Override
    public void delete(Vet Vet) {
        super.delete(Vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
