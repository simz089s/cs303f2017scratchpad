package m9;

public class NumberPrinter extends Thread
{
	private NumberBox aNumberBox;
	
	public NumberPrinter(NumberBox pNumberBox)
	{
		aNumberBox = pNumberBox;
	}
	
	public void run()
	{
        System.out.println(aNumberBox);
    }

}
