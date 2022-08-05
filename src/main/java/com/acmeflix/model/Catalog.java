package com.acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Catalog extends BaseModel{
    private Account account;
    private Set<CatalogTVSeries> tvSeries;
    private Set<CatalogMovie> movies;

}
