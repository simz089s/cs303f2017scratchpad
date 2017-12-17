package m9;

public class NumberIncrementer extends Thread
{
	private NumberBox aNumberBox;
	
	public NumberIncrementer(NumberBox pNumberBox)
	{
		aNumberBox = pNumberBox;
	}
	
	public void run()
	{
        aNumberBox.increment();
    }

}
