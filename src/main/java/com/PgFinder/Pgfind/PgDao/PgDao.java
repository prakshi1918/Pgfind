package com.PgFinder.Pgfind.PgDao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.PgFinder.Pgfind.model.Pg;

public interface PgDao extends CrudRepository<Pg,Long> {

	List<Pg> findByCity(String city);
}
