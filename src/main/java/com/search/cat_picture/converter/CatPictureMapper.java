package com.search.cat_picture.converter;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.search.cat_picture.dto.CatPictureResponse;
import com.search.cat_picture.dto.CatPictureResponses;
import com.search.cat_picture.entity.CatPicture;
import com.search.cat_picture.global.openFeign.theCat.TheCatImageResponse;
import com.search.cat_picture.global.openFeign.theCat.TheCatSimpleImageResponse;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CatPictureMapper {

	CatPicture theCatResponseToEntity(TheCatImageResponse theCatImageResponse);

	CatPictureResponse entityToResponse(CatPicture catPicture);

	CatPictureResponses theCatResponsesToResponses(List<TheCatSimpleImageResponse> responses);
}
