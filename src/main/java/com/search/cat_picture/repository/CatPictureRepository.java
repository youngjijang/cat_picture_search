package com.search.cat_picture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search.cat_picture.entity.CatPicture;

public interface CatPictureRepository extends JpaRepository<CatPicture, String> {
}
