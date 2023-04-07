package com.search.cat_picture.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("")
@SpringBootTest
class SearchServiceTest {

	@Autowired
	private SearchService service;

	@Test
	void getById(){
		service.getCatPictureBy("zly78vxmW");
	}

}