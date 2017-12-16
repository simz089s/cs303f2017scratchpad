package m7;

public abstract class AbstractVisitor implements Visitor
{

	@Override
	public void visitFile(File pFile)
	{
		// Does nothing
	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		for (IFile file : pSymLink)
		{
			file.accept(this);
		}
	}

	@Override
	public void visitDirectory(Directory pDirectory)
	{
		for (IFile file : pDirectory)
		{
			file.accept(this);
		}
	}

}
