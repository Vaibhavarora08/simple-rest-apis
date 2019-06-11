package com.example.simplerestapis.models;
public class SampleResponse {
	private long version;
	private long id;
	private String description;

	public long getversion() {
		return version;
	}

	public void setversion(long version) {
		this.version = version;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

}
