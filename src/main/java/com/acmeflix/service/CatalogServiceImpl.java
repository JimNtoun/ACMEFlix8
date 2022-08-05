package com.acmeflix.service;

import com.acmeflix.model.*;
import com.acmeflix.repository.CatalogRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CatalogServiceImpl extends BaseServiceImpl<Catalog> implements CatalogService {
    private final CatalogRepository catalogRepository;
    @Override
    public JpaRepository<Catalog, Long> getRepository() {
        return catalogRepository;
    }

    @Override
    public Catalog initiateCatalog(Account account) {
        return Catalog.builder().account(account).build();
    }

    @Override
    public void addCatalogMovie(Catalog catalog, WatchItem watchItem, String movieTitle) {

    }

    @Override
    public void updateCatalogMovie(Catalog catalog, WatchItem watchItem, String movieTitle) {

    }

    @Override
    public void removeCatalogMovie(Catalog catalog, WatchItem watchItem) {

    }

    @Override
    public Catalog getLazy(Long id) {
        return null;
    }


}
