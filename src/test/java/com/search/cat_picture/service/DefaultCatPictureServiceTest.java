package com.search.cat_picture.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DefaultCatPictureServiceTest {

	@Autowired
	private TheCatPictureService service;

	@Test
	void getById(){
		service.getPictureById("zly78vxmW");

		var res = service.getRandomPictures(30);
		System.out.println(res);
	}

}