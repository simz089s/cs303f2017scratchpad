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
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				aNumberBox.increment();
			}
			catch (InterruptedException e)
			{
				return;
			}
		}
    }

}
