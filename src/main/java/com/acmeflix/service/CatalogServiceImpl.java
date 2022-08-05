package com.acmeflix.service;

import com.acmeflix.model.Account;
import com.acmeflix.model.Catalog;
import com.acmeflix.model.CatalogMovie;
import com.acmeflix.repository.CatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
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
    public void addMovie(Catalog catalog, CatalogMovie catalogMovie, String movieTitle) {

    }

    @Override
    public void updateMovie(Catalog catalog, CatalogMovie catalogMovie, String movieTitle) {

    }

    @Override
    public void removeMovie(Catalog catalog, CatalogMovie catalogMovie) {

    }

    @Override
    public void addTVShow(Catalog catalog, CatalogMovie catalogMovie, String movieTitle) {

    }

    @Override
    public void updateTVShow(Catalog catalog, CatalogMovie catalogMovie, String movieTitle) {

    }

    @Override
    public void removeTVShow(Catalog catalog, CatalogMovie catalogMovie) {

    }
}
