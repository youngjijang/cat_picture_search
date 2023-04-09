package com.search.cat_picture.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.search.cat_picture.dto.CatPictureResponse;
import com.search.cat_picture.dto.CatPictureResponses;
import com.search.cat_picture.global.openFeign.theCat.TheCatClient;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
@Transactional(readOnly = true)
public class DefaultCatPictureService implements CatPictureService {

	private final TheCatClient theCatClient;

	public void getCatPictureBy(String id) {
		var res = theCatClient.findCatPictureById(id);
		log.info(res.toString());
	}

	public CatPictureResponses getRandomCatPictures(int limit) {
		theCatClient.findRandomPictures(limit);
		return null;
	}

	public CatPictureResponses getCatPicturesByBreedName(String breedName) {
		return null;
	}

	public CatPictureResponse getCatPictureById(String imageId) {
		return null;
	}
}
