package scratchpad;
import java.util.ArrayList;

import module05.ca.mcgill.cs.swdesign.m5.Movie;
import module05.ca.mcgill.cs.swdesign.m5.Show;

public class MidtermIterator implements Iterable<T>
{
	private List<Show> aShows;
	
	public Iterator<Movie> iterator()
	{
		List<Movie> movies = new ArrayList<>();
		for (Show show : aShows)
		{
			Movie movie = show.getFirst();
			if (!movies.contains(movie))
			{
				movies.add(movie);
			}
			
		}
	}
}
