package com.george.dev.data.services.map;

import com.george.dev.data.model.BaseEntity;

import java.util.*;

/**
 * Created by George on 15/11/2018
 */

public abstract class AbstractMapService <T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){

        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){

        Long nextId = null;

        try{
            nextId = Collections.max(map.keySet()) +1;
        }catch (NoSuchElementException ex){
            nextId = 1L;
        }

        return nextId;
    }
}
