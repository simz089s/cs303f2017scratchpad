package m7;

public class MainVisitorTest
{

	public static void main(String[] args)
	{
		Directory directory = new Directory(new String("/root"));
		for (int i = 0; i < 5; i++)
		{
			File pFiles = new File(new String("/file" + i));
			directory.addFiles(pFiles);
		}
		directory.addFiles(new SymLink(new String("/symbolic_link")));
		PrintVisitor printer = new PrintVisitor();
		printer.visitDirectory(directory);
	}

}
