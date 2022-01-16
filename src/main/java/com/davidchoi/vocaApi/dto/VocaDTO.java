package com.davidchoi.vocaApi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VocaDTO {
	private int id;
	private String text;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
