package finalpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends AbstractFile implements Iterable<IFile>
{

	private List<IFile> aIFiles = new ArrayList<>();
	
	public Directory(String pName, IFile...pIFiles)
	{
		super(pName);
		for (IFile pIFile : pIFiles)
		{
			aIFiles.add(pIFile);
		}
	}
	
	public void addIFile(IFile...pIFiles)
	{
		for (IFile pIFile : pIFiles)
		{
			aIFiles.add(pIFile);
		}
	}

	@Override
	public Iterator<IFile> iterator()
	{
		return aIFiles.iterator();
	}

	@Override
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitDirectory(this);
	}
	
	public void clear()
	{
		aIFiles.clear();
	}

}
