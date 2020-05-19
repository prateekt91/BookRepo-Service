/**
 * 
 */
package com.bookeep.search.restApiImpl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookeep.search.model.BooksCatalog;
import com.bookeep.search.restApi.RestApi;
import com.bookeep.search.services.BooksCatalogService;

/**
 * @author Prateek
 * @Date 5/17/2020
 *
 */
@Component
public class RestApiImpl implements RestApi{

	 private static final Logger logger = LoggerFactory.getLogger(RestApiImpl.class);
	 
	 @Autowired
	 BooksCatalogService bookService;
	
	public List<BooksCatalog> getBookByName(String name) {
		logger.info("In getBookBYName: "+name);
		
		List<BooksCatalog> book = bookService.getBookbyTitle(name);
		logger.info(book.get(0).toString());
		return bookService.getBookbyTitle(name);
		//return bookService.getAllBooks();
	}

	@Override
	public List<BooksCatalog> getAllBooks() {
		// TODO Auto-generated method stub
		return bookService.getAllBooks();
	}
	
	

}
