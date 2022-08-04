package com.acmeflix.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public abstract class BaseModel implements Serializable {
    private Long id;
}
