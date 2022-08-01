package com.dbCLM.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbCLM.entities.Nace;
import com.dbCLM.repository.NaceRepository;

@RestController
public class NaceRestController {
	
    @Autowired
	private NaceRepository naceRepo;
	
	
	@PutMapping("/updateApi")
	public void putNaceDetails(@RequestBody Nace nace) {
		naceRepo.save(nace);
	}
	
	@GetMapping("/getapi/{id}")
	public Nace getNaceDetails(@PathVariable long id) {
	 try {
		Optional<Nace> findById = naceRepo.findById(id);
		Nace nace = findById.get();
	 return nace;
	 }
	 catch (Exception e) {
		 e.printStackTrace();
	 }
	 return null;
	}
}
