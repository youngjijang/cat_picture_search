package com.search.cat_picture.service;

public interface CatBreedService {

	int saveAllBreeds(Integer maximum);

	String findIdByName(String name);
}
