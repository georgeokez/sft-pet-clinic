package com.george.dev.data.services.map;

import com.george.dev.data.model.Vet;
import com.george.dev.data.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by George on 15/11/2018
 */

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
        return super.save( Vet);
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
