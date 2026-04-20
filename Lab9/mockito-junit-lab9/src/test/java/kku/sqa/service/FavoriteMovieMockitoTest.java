//นายยศนนท์ ดวงไข 663380021-5 sec1
package kku.sqa.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.api.MovieService;

class FavoriteMovieMockitoTest {

	@Test
	void testUsingMockito() {
		MovieService movieservice = mock(MovieService.class);
		List<String> movielist = Arrays.asList(	"The Notebook [datenight]",
												"The Nun [horror]",
												"50 First Dates [datenight]",
												"Top Gun: Maverick [action]", 
												"John Wick [action]", 
												"Annabelle [horror]",
												"Mission: Impossible [action]",
												"A Walk to Remember [datenight]", 
												"The Conjuring [horror]",
												"The Lucky One [datenight]"
											   );
		
		when(movieservice.getMovieCatalogue("Yodsanon", "action")).thenReturn(movielist);
		
		FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
		List<String> actionmovielist = favoritemovie.getMovie("Yodsanon", "action");
		
		assertEquals(3, actionmovielist.size());		
	}

}
