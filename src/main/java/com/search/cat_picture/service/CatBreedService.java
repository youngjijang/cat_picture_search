package com.search.cat_picture.service;

import com.search.cat_picture.entity.CatBreed;

public interface CatBreedService {

	int saveAllBreeds(Integer maximum);

	String getIdByName(String name);
}
