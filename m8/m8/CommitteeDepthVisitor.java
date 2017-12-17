package m8;

public class CommitteeDepthVisitor extends DefaultVisitor
{
	private String aQuery;
	private int aResult = 0;
	private int aDepth = 0;
	
	public CommitteeDepthVisitor(String pQuery)
	{
		aQuery = pQuery;
	}
	
	public int getResult()
	{
		return aResult;
	}

	@Override
	public void visitUniversity(University pUniversity)
	{
		super.visitUniversity(pUniversity);
	}

	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		super.visitFaculty(pFaculty);
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		super.visitDepartment(pDepartment);
	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		if( pCommittee.name().equals(aQuery))
		{
			aResult = aDepth;
		}
		else
		{
			aDepth++;
			super.visitCommittee(pCommittee);
			aDepth--;
		}
	}
	
	
}
