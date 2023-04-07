package com.search.cat_picture.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("")
@SpringBootTest
class CatPictureServiceTest {

	@Autowired
	private CatPictureService service;

	@Test
	void getById(){
		service.getCatPictureBy("zly78vxmW");

		var res = service.getRandomCatPictures(30);
		System.out.println(res);
	}

}