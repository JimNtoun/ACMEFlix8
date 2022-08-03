package com.acmeflix.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Builder
@Setter
@Getter
@ToString(callSuper = true)

public class Movie extends BaseModel  {
    private String name;
    private Date date;
    private Category category;
    private Long rate;
    private Long duration;
    private LikeDislike likeDislike;
}

