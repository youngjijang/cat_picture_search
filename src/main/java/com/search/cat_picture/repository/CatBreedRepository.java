package com.search.cat_picture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search.cat_picture.entity.CatBreed;

public interface CatBreedRepository extends JpaRepository<CatBreed, String> {
}