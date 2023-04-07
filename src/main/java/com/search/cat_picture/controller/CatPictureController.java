package com.search.cat_picture.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.cat_picture.controller.dto.CatPictureResponse;
import com.search.cat_picture.controller.dto.CatPictureResponses;
import com.search.cat_picture.service.CatPictureService;

import jakarta.validation.constraints.NotNull;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

@RequestMapping(value = "/cats")
@RestController
@RequiredArgsConstructor
public class CatPictureController {

	private final CatPictureService catPictureService;

	@GetMapping(value = "/random50")
	public ResponseEntity<CatPictureResponses> getRandom50CatPictures(){
		return ResponseEntity.ok(catPictureService.getRandomCatPictures(50));
	}

	@GetMapping(value = "/search")
	public ResponseEntity<CatPictureResponses> getCatPicturesByBreed(@PathParam("q") @NotNull String breedName){
		return ResponseEntity.ok(catPictureService.getCatPicturesByBreedName(breedName));
	}

	@GetMapping(value = "/{imageId}")
	public ResponseEntity<CatPictureResponse> getCatPictureById(@PathVariable String imageId){
		return ResponseEntity.ok(catPictureService.getCatPictureById(imageId));
	}
}
