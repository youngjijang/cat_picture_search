package com.search.cat_picture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CatBreed {

	@Id
	String id;

	String name;
}
