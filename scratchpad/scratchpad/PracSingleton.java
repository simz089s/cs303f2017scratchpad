package scratchpad;

public class PracSingleton
{
	
	private final static String INSTANCE = new String("The singleton");
	
	private PracSingleton() {}
	
	public static String get()
	{
		return INSTANCE;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
