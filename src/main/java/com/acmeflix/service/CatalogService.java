package com.acmeflix.service;

import com.acmeflix.model.Account;
import com.acmeflix.model.Catalog;
import com.acmeflix.model.CatalogMovie;

public interface CatalogService extends  BaseService<Catalog> {
    Catalog initiateCatalog(Account account);
    void addMovie(Catalog catalog, CatalogMovie catalogMovie, String movieTitle);
    void updateMovie(Catalog catalog, CatalogMovie catalogMovie, String movieTitle);
    void removeMovie(Catalog catalog, CatalogMovie catalogMovie);
    void addTVShow(Catalog catalog, CatalogMovie catalogMovie, String movieTitle);
    void updateTVShow(Catalog catalog, CatalogMovie catalogMovie, String movieTitle);
    void removeTVShow(Catalog catalog, CatalogMovie catalogMovie);
}
