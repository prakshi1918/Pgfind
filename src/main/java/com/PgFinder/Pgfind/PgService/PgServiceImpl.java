package com.PgFinder.Pgfind.PgService;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PgFinder.Pgfind.PgDao.PgDao;
import com.PgFinder.Pgfind.PgFeaturesDao.PgFeaturesDao;
import com.PgFinder.Pgfind.model.Pg;
import com.PgFinder.Pgfind.model.PgFeatures;
@Service
public class PgServiceImpl implements PgService {
	@Autowired
	private PgDao pgdao;
	@Autowired
	private PgFeaturesDao pgfeatures;
	@Transactional
	@Override
	public
	List<Pg> getMumbaPgsbyCity(){
		return pgdao.findByCity("Mumbai");
	}
	@Override
	public PgFeatures getPgFeatures(long id) {
		// TODO Auto-generated method stub
		Optional<PgFeatures> pgOptional=pgfeatures.findById(id);
		PgFeatures pgFeatures=(PgFeatures)pgOptional.get();
		return pgFeatures;
	}
	
	//method not used but working fine for fetching features
	@Override
	public List<PgFeatures> featureswalaList(long m) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Pg> getHydPgsbyCity() {
		// TODO Auto-generated method stub
	return	pgdao.findByCity("Hyderabad");
	}
	@Override
	public List<Pg> getPgsKolkabyCity() {
		// TODO Auto-generated method stub
		return pgdao.findByCity("Kolkata");
	}
	
	
}
