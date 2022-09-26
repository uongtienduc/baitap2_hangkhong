package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.chuyenbay;
import com.example.repositories.ChuyenBayRepository;

@Service
public class ChuyenbayServiceImpl implements ChuyenbayService {
	@Autowired
	private ChuyenBayRepository chuyenbayRepo;

	public chuyenbay save(chuyenbay entity) {
		return chuyenbayRepo.save(entity);
	}

	public List<chuyenbay> saveAll(List<chuyenbay> entities) {
		return chuyenbayRepo.saveAll(entities);
	}

	public Optional<chuyenbay> findById(Integer id) {
		return chuyenbayRepo.findById(id);
	}

	public boolean existsById(Integer id) {
		return chuyenbayRepo.existsById(id);
	}

	public Iterable<chuyenbay> findAll() {
		return chuyenbayRepo.findAll();
	}

	public Iterable<chuyenbay> findAllById(Iterable<Integer> ids) {
		return chuyenbayRepo.findAllById(ids);
	}

	public long count() {
		return chuyenbayRepo.count();
	}

	public void deleteById(Integer id) {
		chuyenbayRepo.deleteById(id);
	}

	public void delete(chuyenbay entity) {
		chuyenbayRepo.delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		chuyenbayRepo.deleteAllById(ids);
	}

	public void deleteAll(Iterable<? extends chuyenbay> entities) {
		chuyenbayRepo.deleteAll(entities);
	}

	public void deleteAll() {
		chuyenbayRepo.deleteAll();
	}
	
	
}
