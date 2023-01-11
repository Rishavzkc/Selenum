package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //This represent login entity class
@Table(name="layout")  //(layout is table name in database)
public class Dashboard {


	@Id
	@Column(name="layout_no")
	private String layout_no;
	
	@Column(name="no_of_documents")
	private int no_of_documents;
	
	@Column(name="no_of_pages")
	private int no_of_pages;
	
	@Column(name="mode_selected")
	private String mode_selected;
	
	@Column(name="date_created")
	private String date_created;
	
	
	//No Args Constructor 
	public Dashboard(){
		
	}

	 // Parameterized Constructors
	public Dashboard(String layout_no, int no_of_documents, int no_of_pages, String mode_selected, String date_created) {
		super();
		this.layout_no = layout_no;
		this.no_of_documents = no_of_documents;
		this.no_of_pages = no_of_pages;
		this.mode_selected = mode_selected;
		this.date_created = date_created;
	}

	//getter and setter
	public String getLayout_no() {
		return layout_no;
	}

	public void setLayout_no(String layout_no) {
		this.layout_no = layout_no;
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
