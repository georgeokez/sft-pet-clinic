package com.george.dev.data.services;

import java.util.Set;

/**
 * Created by George on 14/11/2018
 */

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
