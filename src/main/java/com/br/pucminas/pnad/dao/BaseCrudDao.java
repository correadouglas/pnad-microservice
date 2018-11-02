package com.br.pucminas.pnad.dao;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.repository.CrudRepository;

public abstract class BaseCrudDao<T> {

	@SuppressWarnings("rawtypes")
	protected abstract CrudRepository getRepository();

	@SuppressWarnings("unchecked")
	public T save(T entity) {
		Objects.requireNonNull(entity);
		return (T) getRepository().save(entity);
	}

	@SuppressWarnings("unchecked")
	public T findById(Serializable id) {
		Objects.requireNonNull(id);
		return (T) getRepository().findById(id);
	}
	
}
