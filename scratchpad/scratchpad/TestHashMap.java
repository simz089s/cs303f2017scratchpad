package scratchpad;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

public class TestHashMap
{
	
	private final static HashMap<String, String> ALL_STRINGS = new HashMap<>();
	
	public static String get(String key)
	{
		if (!ALL_STRINGS.containsKey(key))
		{
			ALL_STRINGS.put(key, key+" value");
		}
		return ALL_STRINGS.get(key);
	}
	
//	@Test(expected = IllegalArgumentException.class)
//	{
//		assertEquals(1, 1);
//	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
