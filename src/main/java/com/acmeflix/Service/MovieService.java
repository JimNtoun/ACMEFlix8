package com.acmeflix.Service;

import com.acmeflix.domain.Movie;

public interface MovieService extends BaseService<Movie> {
    Movie findByName(String name);
}
