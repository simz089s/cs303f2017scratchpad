package scratchpad;
import java.util.ArrayList;
import java.util.Iterator;

public class PracIterator implements Iterable<String>
{
	
	private ArrayList<String> theList = new ArrayList<>();
	
	@Override
	public Iterator<String> iterator()
	{
		return this.theList.iterator();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
