package com.george.dev.sftpetclinic.services;

import com.george.dev.sftpetclinic.model.Owner;

/**
 * Created by George on 13/11/2018
 */

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
