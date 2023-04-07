package com.search.cat_picture.global.openFeign.theCat;

import java.util.List;

public record CatPictureResponse
	(String id, String url, Integer width, Integer height, String mimeType, List<BreedResponse> breeds) {
}
