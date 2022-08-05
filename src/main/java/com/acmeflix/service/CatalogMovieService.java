package com.acmeflix.service;

import com.acmeflix.model.CatalogCategoryTVMovie;
import com.acmeflix.model.CatalogMovie;

public interface CatalogMovieService extends BaseService<CatalogMovie> {
    CatalogMovie findCatalogMovieByCatalogCategoryTVMovieAndMovieTitle(final CatalogCategoryTVMovie catalogCategoryTVMovie, final CatalogMovie movieTitle);
}
