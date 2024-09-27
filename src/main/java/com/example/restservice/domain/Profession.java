package com.example.restservice.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Profession(String idBean, String description, String titleBean;)
{
	@Bean
	@Document
	
	this.idBean = idBean;
    this.description = description;
    this.titleBean = titleBean;


	private String getIdBean() {
		return idBean;}
	public void setIdBean(String idBean) {
        this.idBean = idBean;
    }

	private String gettitleBean() {
		return titleBean;}	
	public void setTitleBean(String titleBean) {
	    this.titleBean = titleBean;
	    }	
	

	public String getDescription() {
		return getDescription();}

	public void setDescription(String description) {
		this.description = description;
	}
}
