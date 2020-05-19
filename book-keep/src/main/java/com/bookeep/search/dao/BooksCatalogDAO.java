/**
 * 
 */
package com.bookeep.search.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookeep.search.model.BooksCatalog;

/**
 * @author Prateek
 * @Date 5/17/2020
 *
 */
@Repository
public interface BooksCatalogDAO extends MongoRepository<BooksCatalog,Integer>{

	@Query(value="{ 'title' : ?0 }")
	List<BooksCatalog> findBookByTitle(String title);
}
