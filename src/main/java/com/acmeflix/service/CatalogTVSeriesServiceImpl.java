package com.acmeflix.service;

import com.acmeflix.model.CatalogCategoryTVMovie;
import com.acmeflix.model.CatalogTVSeries;
import com.acmeflix.repository.CatalogTVSeriesRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CatalogTVSeriesServiceImpl extends BaseServiceImpl<CatalogTVSeries> implements CatalogTVSeriesService{
    private final CatalogTVSeriesRepository catalogTVSeriesRepository;

    @Override
    public JpaRepository<CatalogTVSeries, Long> getRepository() {
        return catalogTVSeriesRepository;
    }

    @Override
    public CatalogTVSeries findCatalogTVSeriesByCatalogCategoryTVMovieAndSeriesTitle(CatalogCategoryTVMovie catalogCategoryTVMovie, CatalogTVSeries seriesTitle) {
        return catalogTVSeriesRepository.findCatalogTVSeriesByCatalogCategoryTVMovieAndSeriesTitle(catalogCategoryTVMovie, seriesTitle);
    }
}
