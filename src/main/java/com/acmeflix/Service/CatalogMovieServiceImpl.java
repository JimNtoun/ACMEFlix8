package com.acmeflix.Service;

import com.acmeflix.model.CatalogMovie;
import com.acmeflix.repository.CatalogMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CatalogMovieServiceImpl extends BaseServiceImpl<CatalogMovie> implements CatalogMovieService {
    private  final CatalogMovieRepository catalogMovieRepository;

    @Override
    public JpaRepository<CatalogMovie, Long> getRepository() {
        return catalogMovieRepository;
    }

    @Override
    public CatalogMovie findByMovieTitle(String movieTitle) {
        return catalogMovieRepository.findByMovieTitle( movieTitle);
    }
}
