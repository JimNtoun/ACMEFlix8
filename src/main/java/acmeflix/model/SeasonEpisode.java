package acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class SeasonEpisode extends BaseModel{
    private SeasonEpisodeLangSub seasonEpisodeLangSub;
    private int episodeDuration;
}
