package com.search.cat_picture.service;

import com.search.cat_picture.dto.CatPictureResponse;
import com.search.cat_picture.dto.CatPictureResponses;

public interface CatPictureService {

	 void getCatPictureBy(String id);

	 CatPictureResponses getRandomCatPictures(int limit);

	 CatPictureResponses getCatPicturesByBreedName(String breedName);

	 CatPictureResponse getCatPictureById(String imageId);

}
