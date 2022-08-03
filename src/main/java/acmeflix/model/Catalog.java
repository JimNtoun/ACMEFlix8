package acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Catalog extends BaseModel{
    private CatalogTVSeries tvSeries;
    private CatalogMovie movies;
}
