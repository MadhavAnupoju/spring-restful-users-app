package com.spring.restful.users.app.validator;

import java.util.List;

public class ApiError {
	private String code;
	private List<String> errors;
	public ApiError() {
	}
	public ApiError(String code, List<String> errors) {
		super();
		this.code = code;
		this.errors = errors;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	@Override
	public String toString() {
		return "ApiError [code=" + code + ", errors=" + errors + "]";
	}

}
