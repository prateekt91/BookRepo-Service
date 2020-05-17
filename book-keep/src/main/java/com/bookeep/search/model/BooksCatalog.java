package com.bookeep.search.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Prateek
 * @Date 5/17/2020
 *
 */

@Document(collection = "BooksCatalog")
public class BooksCatalog {

	private String isbn;
	private String title;
	private String subtitle;
	private String author;
	private String published;
	private String publisher;
	private int pages;
	private String description;
	private String website;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	@Override
	public String toString() {
		return "BooksCatalog [isbn=" + isbn + ", title=" + title + ", subtitle=" + subtitle + ", author=" + author
				+ ", published=" + published + ", publisher=" + publisher + ", pages=" + pages + ", description="
				+ description + ", website=" + website + "]";
	}
	
	
}
