package com.acmeflix.Service;

import com.acmeflix.repository.TvSeries;

public interface TvSeriesService extends BaseService<TvSeriesService> {
    TvSeries findByName(String name);
}
