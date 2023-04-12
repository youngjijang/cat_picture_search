package com.search.cat_picture.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.search.cat_picture.converter.CatPictureMapper;
import com.search.cat_picture.dto.CatPictureResponse;
import com.search.cat_picture.dto.CatPictureResponses;
import com.search.cat_picture.entity.CatPicture;
import com.search.cat_picture.global.openFeign.theCat.TheCatImageClient;
import com.search.cat_picture.repository.CatPictureRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TheCatPictureService implements CatPictureService {

	private final TheCatImageClient theCatImageClient;

	private final CatPictureRepository catPictureRepository;

	private final CatBreedService catBreedService;

	private final CatPictureMapper catPictureMapper;

	public CatPictureResponses getRandomPictures(int limit) {
		return
			new CatPictureResponses(
				catPictureMapper.theCatResponsesToSimpleResponse(theCatImageClient.findRandomPictures(limit)));
	}

	public CatPictureResponses getPicturesByBreedName(String breedName) {
		String breedId = catBreedService.findIdByName(breedName);
		if(breedId.isEmpty()){
			return new CatPictureResponses(new ArrayList<>());
		}
		return
			new CatPictureResponses(
				catPictureMapper.theCatResponsesToSimpleResponse(theCatImageClient.findPicturesByBreed(breedId)));
	}

	@Transactional
	public CatPictureResponse getPictureById(String imageId) {
		CatPicture catPicture = catPictureRepository.findById(imageId)
			.orElse(findInTheCatAndSaveById(imageId));
		return catPictureMapper.entityToResponse(catPicture);
	}

	private CatPicture findInTheCatAndSaveById(String imageId) {
		CatPicture catPicture = catPictureMapper.theCatResponseToEntity
			(theCatImageClient.findCatPictureById(imageId));
		return catPictureRepository.save(catPicture);
	}

}
