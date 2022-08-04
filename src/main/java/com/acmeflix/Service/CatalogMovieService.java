package com.acmeflix.Service;

import com.acmeflix.model.CatalogMovie;
import com.acmeflix.repository.CatalogMovieRepository;

public interface CatalogMovieService extends BaseService<CatalogMovie> {
    CatalogMovie findByMovieTitle(String movieTitle);
}
