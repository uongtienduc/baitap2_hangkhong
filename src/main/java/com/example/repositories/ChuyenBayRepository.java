package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.chuyenbay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<chuyenbay, Integer> {

}
