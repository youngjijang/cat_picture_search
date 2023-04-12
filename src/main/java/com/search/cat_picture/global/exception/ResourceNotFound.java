package com.search.cat_picture.global.exception;

public class ResourceNotFound extends RuntimeException {

	private final Class<?> resource;

	public ResourceNotFound(Class<?> resource) {
		this.resource = resource;
	}

	@Override
	public String getMessage() {
		return String.format("%s를 찾을 수 없습니다.", resource.getName());
	}
}
