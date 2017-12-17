package finalpractice;

public class DeleteVisitor extends AbstractVisitor
{
	private final String aName;

	public DeleteVisitor(String pName)
	{
		super();
		aName = pName;
	}
	
	@Override
	public void visitFile(File pFile)
	{
		if (pFile.getName().equals(aName))
		{
			System.out.println("del /" + pFile.getName());
		}
		else
		{
			super.visitFile(pFile);
		}
	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		if (pSymLink.getName().equals(aName))
		{
			pSymLink.delete();
			System.out.println("del /" + pSymLink.getName());
		}
		else
		{
			super.visitSymLink(pSymLink);
		}
	}

	@Override
	public void visitDirectory(Directory pDirectory)
	{
		if (pDirectory.getName().equals(aName))
		{
			pDirectory.clear();
			System.out.println("del /" + pDirectory.getName());
		}
		else
		{
			super.visitDirectory(pDirectory);
		}
	}
	
	public void visitHiddenDirectory(HiddenDirectory pHiddenDirectory)
	{
		if (pHiddenDirectory.getName().equals("." + aName))
		{
			pHiddenDirectory.clear();
			System.out.println("del /" + pHiddenDirectory.getName());
		}
		else
		{
			super.visitHiddenDirectory(pHiddenDirectory);
		}
	}

}
