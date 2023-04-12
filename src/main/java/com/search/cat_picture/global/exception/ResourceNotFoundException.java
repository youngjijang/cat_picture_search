package com.search.cat_picture.global.exception;

public class ResourceNotFoundException extends RuntimeException {

	private Class<?> resource;
	private final String message;

	public ResourceNotFoundException() {
		this.message = "해당 리소스를 찾을 수 없습니다.";
	}

	public ResourceNotFoundException(Class<?> resource) {
		this.resource = resource;
		this.message = String.format("%s를 찾을 수 없습니다.", resource.getName());
	}

	@Override
	public String getMessage() {
		return message;
	}
}
