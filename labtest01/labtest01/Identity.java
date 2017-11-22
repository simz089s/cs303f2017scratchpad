package labtest01;

public class Identity {

	private final String aName;
	
	protected Identity(String pName)
	{
		aName = pName;
	}

	/**
	 * @return The name of this identity.
	 */
	public String getName() {
		return aName;
	}

}
