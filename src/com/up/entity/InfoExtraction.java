package com.up.entity;

import java.util.Date;

public class InfoExtraction {
	private String extractedLink;
	private String extractedDate;
	
	public InfoExtraction(String extractedLink, String extractedDate) {
		super();
		this.extractedLink = extractedLink;
		this.extractedDate = extractedDate;
	}

	public String getExtractedLink() {
		return extractedLink;
	}

	public void setExtractedLink(String extractedLink) {
		this.extractedLink = extractedLink;
	}

	public String getExtractedDate() {
		return extractedDate;
	}

	public void setExtractedDate(String extractedDate) {
		this.extractedDate = extractedDate;
	}
	
	
}
