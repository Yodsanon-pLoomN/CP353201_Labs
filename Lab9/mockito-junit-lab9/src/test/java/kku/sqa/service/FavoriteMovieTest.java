//นายยศนนท์ ดวงไข 663380021-5 sec1
package kku.sqa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.api.MovieService;
import kku.sqa.stub.MovieServiceStub;

class FavoriteMovieTest {

	@Test
	void test_getActionMovie_withStub() {
		MovieService movieservice = new MovieServiceStub();
		FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
		List<String> movielist = favoritemovie.getMovie("Yodsanon", "action");
		assertEquals(3, movielist.size());		
	}

}
