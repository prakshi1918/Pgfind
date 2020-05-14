package com.PgFinder.Pgfind.PgService;

import java.util.List;
import java.util.Optional;

import com.PgFinder.Pgfind.model.Pg;
import com.PgFinder.Pgfind.model.PgFeatures;

public interface PgService {
	List<Pg> getMumbaPgsbyCity();
	List<Pg> getHydPgsbyCity();
	List<Pg> getPgsKolkabyCity();
	public PgFeatures getPgFeatures(long id);
	List<PgFeatures> featureswalaList(long m);
}
