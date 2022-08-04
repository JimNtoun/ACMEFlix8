package com.acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class CatalogMovie extends BaseModel{
    private String movieTitle;
    private CatalogCategoryTVMovie catalogCategoryTVMovie;
    private Long duration;
    private StarRate starRate;
    private LikeDislike likeDislike;
}
