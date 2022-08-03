package com.acmeflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvSeries extends JpaRepository<TvSeries , Long> {
}
