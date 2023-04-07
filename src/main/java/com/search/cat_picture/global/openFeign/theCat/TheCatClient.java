package com.search.cat_picture.global.openFeign.theCat;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import feign.Headers;
import jakarta.websocket.server.PathParam;

@FeignClient(name = "TheCatClient", url = "${THE_CAT_CLIENT_URL}")
@Headers("x-api-key: ${THE_CAT_CLIENT_KEY}")
public interface TheCatClient{

	@GetMapping(value = "/images/search")
	CatPicturesResponse findRandomPictures(@PathParam("limit") Integer limit);

	@GetMapping(value = "/images/{imagesId}")
	CatPictureResponse findCatPictureById(@PathVariable String imagesId);

	@GetMapping(value = "/images/search")
	CatPicturesResponse findPicturesByBreed(@PathParam("breed_ids") String breedId);

}
