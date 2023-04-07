package com.search.cat_picture.entity;

import org.hibernate.validator.constraints.URL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CatPicture {

	@Id
	String id;
}
