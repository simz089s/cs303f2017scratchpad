package finalpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SymLink extends AbstractFile implements Iterable<IFile>
{

	private List<IFile> aIFile = new ArrayList<>();
	
	public SymLink(String pName, IFile pIFile)
	{
		super(pName);
		aIFile.add(pIFile);
	}
	
	public void changeSymLink(IFile pIFile)
	{
		aIFile.clear();
		aIFile.add(pIFile);
	}

	@Override
	public Iterator<IFile> iterator() {
		return aIFile.iterator();
	}

	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitSymLink(this);
	}

}
