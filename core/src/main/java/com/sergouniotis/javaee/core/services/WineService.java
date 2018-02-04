package com.sergouniotis.javaee.core.services;

import java.util.Collection;

import com.sergouniotis.javaee.core.domain.Wine;

public interface WineService {

	Collection<Wine> findAll();

	Collection<Wine> load();

}
