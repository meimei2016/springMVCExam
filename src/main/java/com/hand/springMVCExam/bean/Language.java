package com.hand.springMVCExam.bean;

import java.util.Date;

public class Language {
	private int language_id;
	private String name;
	private Date last_update;
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	public Language(int language_id, String name, Date last_update) {
		super();
		this.language_id = language_id;
		this.name = name;
		this.last_update = last_update;
	}
	
	public Language(){}

}
