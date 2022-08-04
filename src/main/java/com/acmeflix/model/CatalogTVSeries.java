package com.acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class CatalogTVSeries extends BaseModel{
    private String seriesTitle;
    private CatalogCategoryTVMovie catalogCategoryTVMovie;
    private Long duration;
    private Season season;
    private SeasonEpisode episodes;
    private StarRate starRate;
    private LikeDislike likeDislike;
}
