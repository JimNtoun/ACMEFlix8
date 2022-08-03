package com.acmeflix.Service;

import com.acmeflix.domain.Movie;
import com.acmeflix.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService {
    private final MovieRepository movieRepository;


    @Override
    public JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Movie findByName(String name) {
        return null;
    }
}
