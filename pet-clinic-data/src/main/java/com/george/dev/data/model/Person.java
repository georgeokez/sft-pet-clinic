package com.george.dev.data.model;

import javax.persistence.MappedSuperclass;

/**
 * Created by George on 12/11/2018
 */

@MappedSuperclass
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
