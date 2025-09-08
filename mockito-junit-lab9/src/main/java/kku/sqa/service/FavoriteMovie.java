//นายยศนนท์ ดวงไข 663380021-5 sec1
package kku.sqa.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.api.MovieService;

public class FavoriteMovie {
	
	private MovieService movieservice;
	
	public FavoriteMovie(MovieService movieservice) {
		super();
		this.movieservice = movieservice;
	}
	
	public List<String> getMovie(String name, String typeMovie) {
		List<String> movielist = new ArrayList<String>();
		List<String> allmovielist = movieservice.getMovieCatalogue(name, typeMovie);
			
		for (String movie: allmovielist) {
			if (movie.contains(typeMovie)) {
				movielist.add(movie);
			}
		}
		return movielist;
	}

}
