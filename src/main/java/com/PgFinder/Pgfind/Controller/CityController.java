package com.PgFinder.Pgfind.Controller;


import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PgFinder.Pgfind.PgFeaturesDao.PgFeaturesDao;
import com.PgFinder.Pgfind.PgService.PgService;
import com.PgFinder.Pgfind.model.Pg;
import com.PgFinder.Pgfind.model.PgFeatures;

@RestController
public class CityController {
	@Autowired
	private PgService pgService;
	@Autowired
	private PgFeaturesDao pgdaofea;
	
	@GetMapping("/Mumbai")
	public List<Pg> GetMumbaiPg(){
		return pgService.getMumbaPgsbyCity();
	}
	@GetMapping("/Hyderabad")
	public List<Pg> GetHyderabadPg(){
		return pgService.getHydPgsbyCity();
	}
	
	
	
	@GetMapping("/Features")
	public PgFeatures getFeatures(@RequestParam long id) {
		//long id=1;
		
		return pgService.getPgFeatures(id);
	}
	@GetMapping("/chal")
	public List<PgFeatures> getpgFeatures(@RequestParam long id){
		//long id=1;
		System.out.println(pgdaofea.featureswalaList(id));
		return pgdaofea.featureswalaList(id);
	}
}