package com.george.dev.data.model;

import java.io.Serializable;

/**
 * Created by George on 13/11/2018
 */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
