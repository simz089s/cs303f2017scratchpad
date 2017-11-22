package scratchpad;
import java.util.HashMap;

public class PracFlyweight
{
	
	public final static HashMap<String, String> ALL_INSTANCES = new HashMap<>();
	
	private PracFlyweight() {}
	
	public static String get(String pName)
	{
		if (!ALL_INSTANCES.containsKey(pName))
		{
			ALL_INSTANCES.put(pName, pName+" value");
		}
		return ALL_INSTANCES.get(pName);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
