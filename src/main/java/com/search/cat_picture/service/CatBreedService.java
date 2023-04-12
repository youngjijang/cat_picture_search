package com.search.cat_picture.service;

public interface CatBreedService {

	int saveAllBreeds(Integer maximum);

	String getIdByName(String name);
}
