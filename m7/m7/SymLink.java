package m7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SymLink extends AbstractFile implements Iterable<IFile>
{

	private List<IFile> aFiles = new ArrayList<>();
	
	protected SymLink(String pName)
	{
		super(pName);
	}
	
	public void addFiles(IFile...pFiles)
	{
		for (IFile file : pFiles)
		{
			aFiles.add(file);
		}
	}
	
	public void removeFiles(IFile...pFiles)
	{
		for (IFile file : pFiles)
		{
			aFiles.remove(file);
		}
	}
	
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visitSymLink(this);
	}

	public Iterator<IFile> iterator()
	{
		return aFiles.iterator();
	}

}
