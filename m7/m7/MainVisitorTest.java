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
		SymLink symlink = new SymLink(new String("/symbolic_link"));
		directory.addFiles(symlink);
		for (int i = 5; i < 10; i++)
		{
			File pFiles = new File(new String("/file" + i));
			symlink.addFiles(pFiles);
		}
		
		PrintVisitor printer = new PrintVisitor();
		printer.visitDirectory(directory);
	}

}
