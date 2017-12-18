package finalpractice;

public class FileSystem
{

	public static void main(String[] args)
	{
		Directory d = new Directory("root");
		d.addIFile(new File("file1"), new SymLink("file2link", new File("file2")), new HiddenDirectory("hidden", new File("file3")));
		
		PrintVisitor ls = new PrintVisitor();
//		ls.visitDirectory(d);
		d.accept(ls);
		
		DeleteVisitor rm = new DeleteVisitor("root");
//		rm.visitDirectory(d);
		d.accept(rm);
		
//		ls.visitDirectory(d);
		d.accept(ls);
	}

}
