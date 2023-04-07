package com.search.cat_picture.global.openFeign.theCat;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import feign.Headers;
import jakarta.websocket.server.PathParam;

@FeignClient(name = "TheCatClient", url = "https://api.thecatapi.com/v1/images")
@Headers("x-api-key: ${THE_CAT_CLIENT_KEY}")
public interface TheCatClient{

	@GetMapping(value = "/search")
	CatPicturesResponse findRandomPictures(@PathParam("limit") Integer limit);

	@GetMapping(value = "/{imagesId}")
	CatPictureResponse findCatPictureById(@PathVariable String imagesId);

	@GetMapping(value = "/search")
	CatPicturesResponse findPicturesByBreed(@PathParam("breed_ids") String breedId);

}
