package com.acmeflix.service;

import com.acmeflix.model.CatalogCategoryTVMovie;
import com.acmeflix.model.CatalogMovie;
import com.acmeflix.repository.CatalogMovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CatalogMovieServiceImpl extends BaseServiceImpl<CatalogMovie> implements CatalogMovieService {
    private final CatalogMovieRepository catalogMovieRepository;

    @Override
    public JpaRepository<CatalogMovie, Long> getRepository() {
        return catalogMovieRepository;
    }

    @Override
    public CatalogMovie findCatalogMovieByCatalogCategoryTVMovieAndMovieTitle(CatalogCategoryTVMovie catalogCategoryTVMovie,CatalogMovie movieTitle) {
        return catalogMovieRepository.findCatalogMovieByCatalogCategoryTVMovieAndMovieTitle(catalogCategoryTVMovie, movieTitle);
    }
}
