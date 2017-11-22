package m7;

public interface IFile
{
	String getName();
	void accept(Visitor visitor);
}
