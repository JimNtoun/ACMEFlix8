package com.acmeflix.repository;

import com.acmeflix.model.CatalogMovie;
import com.acmeflix.model.WatchItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchItemRepository extends JpaRepository<WatchItem, Long> {
}
