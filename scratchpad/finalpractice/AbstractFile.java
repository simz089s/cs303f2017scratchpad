package finalpractice;

public abstract class AbstractFile implements IFile
{
	private String aName;
	
	protected AbstractFile(String pName)
	{
		aName = pName;
	}

	@Override
	public String getName()
	{
		return aName;
	}

}
