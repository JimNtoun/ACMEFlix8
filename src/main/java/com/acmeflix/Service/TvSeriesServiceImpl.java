package com.acmeflix.Service;

import com.acmeflix.domain.TvSeries;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class TvSeriesServiceImpl extends BaseServiceImpl<TvSeries> implements TvSeriesService {
}
