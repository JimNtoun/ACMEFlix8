package com.acmeflix.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Builder
@Getter
@Setter
@ToString(callSuper = true)

public class TvSeries extends BaseModel{
    private String name;
    private Category category;
    private Date date;
    private Long season;
    private Long rate;
    private Long episodes;
    private LikeDislike likeDislike;
}
