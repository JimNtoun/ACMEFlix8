package com.acmeflix.service;

import com.acmeflix.model.CatalogCategoryTVMovie;
import com.acmeflix.model.CatalogTVSeries;

public interface CatalogTVSeriesService extends BaseService<CatalogTVSeries>{
    CatalogTVSeries findCatalogTVSeriesByCatalogCategoryTVMovieAndSeriesTitle(final CatalogCategoryTVMovie catalogCategoryTVMovie, final CatalogTVSeries seriesTitle);
}
