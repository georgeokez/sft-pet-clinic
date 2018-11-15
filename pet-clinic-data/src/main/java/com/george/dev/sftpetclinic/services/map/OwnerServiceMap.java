package com.george.dev.sftpetclinic.services.map;

import com.george.dev.sftpetclinic.model.Owner;
import com.george.dev.sftpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by George on 15/11/2018
 */

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
