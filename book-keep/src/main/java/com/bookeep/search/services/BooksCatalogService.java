/**
 * 
 */
package com.bookeep.search.services;

import java.util.List;

import com.bookeep.search.model.BooksCatalog;

/**
 * @author Prateek
 * @Date 5/17/2020
 *
 */
public interface BooksCatalogService {

	/**
	 * Method to create new BookEntry in the db using mongo-db repository.
	 * @param booksCatalog
	 */
	public void createBookRecord(List<BooksCatalog> booksCatalog);
	
	/**
	 * Method to fetch all Books Records from the db using mongo-db repository.
	 * @return
	 */
	public List<BooksCatalog> getAllBooks();
	
	/**
	 * Method to fetch Book by Title using mongo-db repository.
	 * @param title
	 * @return
	 */
	public List<BooksCatalog> getBookbyTitle(String title);
}
