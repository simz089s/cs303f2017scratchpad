package m9;

public class MainNumberBox
{
	
	public static void main(String[] args)
	{
		NumberBox nb = new NumberBox();
		Thread ni = new NumberIncrementer(nb);
		Thread np = new NumberPrinter(nb);
		
		ni.start();
		np.start();
		
		for (int i = 0; i < 1000000000; i++)
		{
			try
			{
				np.sleep(4000);
			}
			catch (InterruptedException e)
			{
				return;
			}
		}
	}

}
