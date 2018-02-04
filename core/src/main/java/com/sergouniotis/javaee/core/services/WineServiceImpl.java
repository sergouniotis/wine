/**
 * 
 */
package com.sergouniotis.javaee.core.services;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.sergouniotis.javaee.core.domain.Wine;
import com.sergouniotis.javaee.core.repository.WineRepository;

/**
 * @author sergouniotis
 *
 */
@Stateless
public class WineServiceImpl implements WineService {

	@Inject
	private WineRepository wineRepository;

	@Override
	public Collection<Wine> findAll() {
		return wineRepository.findAll();
	}

	@Override
	public Collection<Wine> load() {
		return null;
	}

}
