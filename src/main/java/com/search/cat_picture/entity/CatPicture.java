package com.search.cat_picture.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Entity
@Getter
public class CatPicture {

	@Id
	String id;

	String url;

	Integer width;

	Integer height;

	PictureProvider provider;

	@OneToMany(cascade = CascadeType.PERSIST)
	List<CatPictureBreedMapping> breeds = new ArrayList<>();
}
