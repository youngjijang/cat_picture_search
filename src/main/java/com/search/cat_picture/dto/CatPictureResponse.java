package com.search.cat_picture.dto;

public record CatPictureResponse(
	String name,
	String id,
	String url,
	int width,
	int height,
	String temperament,
	String origin
) {
}
