package com.search.cat_picture.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CatPicture {

	@Id
	String id;

	String url;

	Integer width;

	Integer height;

	String mimeType;

	@OneToMany
	List<CatBreed> breeds;
}
