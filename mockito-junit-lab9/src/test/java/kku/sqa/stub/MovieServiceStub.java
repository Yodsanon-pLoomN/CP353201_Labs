//นายยศนนท์ ดวงไข 663380021-5 sec1
package kku.sqa.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.api.MovieService;

public class MovieServiceStub implements MovieService {
	
	public List<String> getMovieCatalogue(String name, String typeMovie) {
		return Arrays.asList(	"The Notebook [datenight]",
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
	}

}
