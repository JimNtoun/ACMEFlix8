package com.acmeflix.service;

import com.acmeflix.model.*;

public interface CatalogService extends  BaseService<Catalog> {
    Catalog initiateCatalog(Account account);


    }
