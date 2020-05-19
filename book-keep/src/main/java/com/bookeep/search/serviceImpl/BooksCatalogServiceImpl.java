/**
 * 
 */
package com.bookeep.search.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookeep.search.dao.BooksCatalogDAO;
import com.bookeep.search.model.BooksCatalog;
import com.bookeep.search.services.BooksCatalogService;

/**
 * @author Prateek
 * @Date 5/17/2020
 *
 */
@Service
public class BooksCatalogServiceImpl implements BooksCatalogService {

	@Autowired
	BooksCatalogDAO booksDAO;
	
	@Override
	public void createBookRecord(List<BooksCatalog> booksCatalog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BooksCatalog> getAllBooks() {
		// TODO Auto-generated method stub
		return booksDAO.findAll();
	}

	@Override
	public List<BooksCatalog> getBookbyTitle(String title) {
		// TODO Auto-generated method stub
		return booksDAO.findBookByTitle(title);
	}

	
}
