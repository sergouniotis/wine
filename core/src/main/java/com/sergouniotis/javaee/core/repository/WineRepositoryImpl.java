package com.sergouniotis.javaee.core.repository;

import javax.ejb.Stateless;

import com.sergouniotis.javaee.core.domain.Wine;

@Stateless
public class WineRepositoryImpl extends AbstractRepository<Wine, Long> implements WineRepository {

	protected WineRepositoryImpl() {
		super(Wine.class);
	}

}
