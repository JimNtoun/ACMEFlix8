package com.acmeflix.domain;


import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
public abstract class BaseModel implements Serializable {
    @Serial
    private Long id;
}
