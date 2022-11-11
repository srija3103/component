package com.tourist.repository;

import org.springframework.data.repository.CrudRepository;

import com.tourist.entity.Tourist;

public interface  TouristRepository extends CrudRepository<Tourist,Integer> {

};