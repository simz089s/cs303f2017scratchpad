package scratchpad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MidtermIterator implements Iterable<Movie>
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
		return movies.iterator();
	}
}
