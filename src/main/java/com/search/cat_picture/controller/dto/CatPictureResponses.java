package com.search.cat_picture.controller.dto;

import java.util.List;

public record CatPictureResponses(List<SimpleCatPictureResponse> catPictures) {

	public record SimpleCatPictureResponse(String id, String url, String name){

	}
}
