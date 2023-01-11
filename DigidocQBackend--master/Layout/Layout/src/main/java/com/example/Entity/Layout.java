package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //This represent login entity class
@Table(name="layout")  //(upload is table name in database)
public class Layout {
    
	@Id
	@Column(name="layout_no")
	private String layout_name;
	
	private String layout_description;
	private int no_of_documents;
	private int no_of_pages;
	private String mode_selected;
	private String date_created;
	
	//No Args Constructor 
	public Layout(){
		
	}

	 // Parameterized Constructors
	
	public Layout(String layout_name, String layout_description, int no_of_documents, int no_of_pages,
			String mode_selected, String date_created) {
		super();
		this.layout_name = layout_name;
		this.layout_description = layout_description;
		this.no_of_documents = no_of_documents;
		this.no_of_pages = no_of_pages;
		this.mode_selected = mode_selected;
		this.date_created = date_created;
	}

	//getter and setter
	public String getLayout_name() {
		return layout_name;
	}

	public void setLayout_name(String layout_name) {
		this.layout_name = layout_name;
	}

	public String getLayout_description() {
		return layout_description;
	}

	public void setLayout_description(String layout_description) {
		this.layout_description = layout_description;
	}

	public int getNo_of_documents() {
		return no_of_documents;
	}

	public void setNo_of_documents(int no_of_documents) {
		this.no_of_documents = no_of_documents;
	}

	public int getNo_of_pages() {
		return no_of_pages;
	}

	public void setNo_of_pages(int no_of_pages) {
		this.no_of_pages = no_of_pages;
	}

	public String getMode_selected() {
		return mode_selected;
	}

	public void setMode_selected(String mode_selected) {
		this.mode_selected = mode_selected;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	
	
	

}