package m7;

public class File extends AbstractFile
{

	protected File(String pName)
	{
		super(pName);
	}

	@Override
	public void accept(Visitor visitor)
	{
		visitor.visitFile(this);
	}
	
}