package com.PgFinder.Pgfind.PgFeaturesDao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.PgFinder.Pgfind.model.Pg;
import com.PgFinder.Pgfind.model.PgFeatures;

public interface PgFeaturesDao extends CrudRepository<PgFeatures, Long> {
	@Query("select p from PgFeatures p where p.id=:m")
	List<PgFeatures> featureswalaList(long m);
	
	
}
