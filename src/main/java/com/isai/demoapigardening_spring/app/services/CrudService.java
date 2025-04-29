package com.isai.demoapigardening_spring.app.services;

import java.util.List;

public interface CrudService<A,C> {
    A findById(Integer idSearch);

    List<A> findAll();

    A save(C entityRequest);

    A update(Integer idSearch, C entityRequest);

    void delete(Integer idSearch);

}
