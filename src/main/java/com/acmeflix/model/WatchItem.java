package com.acmeflix.model;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WatchItem extends BaseModel{
    private CatalogTVSeries catalogTVSeries;
    private CatalogMovie catalogMovie;
}
