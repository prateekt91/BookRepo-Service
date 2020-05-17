/**
 * 
 */
package com.bookeep.search.restApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookeep.search.model.BooksCatalog;

/**
 * @author Prateek
 * @Date 5/17/2020
 *
 */
@RestController
@RequestMapping("api/v1")
public interface RestApi {

	@GetMapping("/searchByName/{name}")
	public List<BooksCatalog> getBookByName(@PathVariable String name);
}
