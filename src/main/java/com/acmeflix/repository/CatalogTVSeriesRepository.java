package com.acmeflix.repository;

import com.acmeflix.model.CatalogCategoryTVMovie;
import com.acmeflix.model.CatalogMovie;
import com.acmeflix.model.CatalogTVSeries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogTVSeriesRepository extends JpaRepository<CatalogTVSeries, Long> {
    CatalogTVSeries findCatalogTVSeriesByCatalogCategoryTVMovieAndSeriesTitle(CatalogCategoryTVMovie catalogCategoryTVMovie, CatalogTVSeries seriesTitle);

}
