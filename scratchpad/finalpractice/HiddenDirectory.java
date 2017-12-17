package finalpractice;

import java.util.Iterator;

public class HiddenDirectory implements IFile, Iterable<IFile>
{
	private final Directory aDirectory;

	public HiddenDirectory(String pName, IFile... pIFiles)
	{
		aDirectory = new Directory(pName, pIFiles);
	}
	
	@Override
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitHiddenDirectory(this);
	}

	@Override
	public Iterator<IFile> iterator()
	{
		return aDirectory.iterator();
	}

	@Override
	public String getName()
	{
		return "." + aDirectory.getName();
	}
	
	public void clear()
	{
		aDirectory.clear();
	}

}
