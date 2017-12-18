package m9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainNumberBox
{
	
	public static void main(String[] args)
	{
		NumberBox nb = new NumberBox();
		Thread ni = new NumberIncrementer(nb);
		Thread np = new NumberPrinter(nb);
		
		ni.start();
		np.start();
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				while (nb.getNumber() < 10)
				{
					
				}
				ni.interrupt();
				np.interrupt();
			}
		}).start();
	}

}
