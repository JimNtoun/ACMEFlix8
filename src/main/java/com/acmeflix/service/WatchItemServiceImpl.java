package com.acmeflix.service;

import com.acmeflix.model.WatchItem;
import com.acmeflix.repository.WatchItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WatchItemServiceImpl extends BaseServiceImpl<WatchItem> implements WatchItemService{
    private final WatchItemRepository watchItemRepository;
    @Override
    public JpaRepository<WatchItem, Long> getRepository() {
        return watchItemRepository;
    }
}
