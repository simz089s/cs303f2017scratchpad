package scratchpad;

public class Dummy
{
	public Dummy()
	{
		super();
		System.out.println("dummy");
	}
	
	@Override
	public String toString()
	{
//		return ((Object)this).toString();
		return super.toString();
	}
}
