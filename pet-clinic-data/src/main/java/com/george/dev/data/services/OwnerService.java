package com.george.dev.data.services;

import com.george.dev.data.model.Owner;

/**
 * Created by George on 13/11/2018
 */

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
