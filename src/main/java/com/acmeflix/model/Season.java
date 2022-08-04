package com.acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Season extends BaseModel{
    private SeasonEpisode seasonEpisode;
    private int cycle;
}
