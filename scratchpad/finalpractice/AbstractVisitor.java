package finalpractice;

public abstract class AbstractVisitor implements Visitor
{
	
	protected AbstractVisitor()
	{
		// 
	}

	@Override
	public void visitFile(File pFile)
	{
		// Visit nothing
	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		for (IFile pIFile : pSymLink)
		{
			pIFile.accept(this);
		}
	}

	@Override
	public void visitDirectory(Directory pDirectory)
	{
		for (IFile pIFile : pDirectory)
		{
			pIFile.accept(this);
		}
	}
	
	@Override
	public void visitHiddenDirectory(HiddenDirectory pHiddenDirectory)
	{
		for (IFile pIFile : pHiddenDirectory)
		{
			pIFile.accept(this);
		}
	}

}
