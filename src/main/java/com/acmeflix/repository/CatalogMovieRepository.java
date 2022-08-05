package com.acmeflix.repository;

import com.acmeflix.model.CatalogCategoryTVMovie;
import com.acmeflix.model.CatalogMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogMovieRepository extends JpaRepository<CatalogMovie , Long> {
    CatalogMovie findCatalogMovieByCatalogCategoryTVMovieAndMovieTitle(CatalogCategoryTVMovie catalogCategoryTVMovie, CatalogMovie movieTitle);
}
