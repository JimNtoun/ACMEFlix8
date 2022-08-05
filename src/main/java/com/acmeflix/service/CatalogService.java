package com.acmeflix.service;

import com.acmeflix.model.*;

public interface CatalogService extends  BaseService<Catalog> {
    Catalog initiateCatalog(Account account);

    void addCatalogMovie(Catalog catalog, WatchItem watchItem, String movieTitle);

    void updateCatalogMovie(Catalog catalog, WatchItem watchItem, String movieTitle);

    void removeCatalogMovie(Catalog catalog, WatchItem watchItem);

    Catalog getLazy(Long id);
    }
