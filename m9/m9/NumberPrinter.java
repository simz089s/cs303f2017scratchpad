package m9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberPrinter extends Thread
{
	private NumberBox aNumberBox;
	
	public NumberPrinter(NumberBox pNumberBox)
	{
		aNumberBox = pNumberBox;
	}
	
	public void run()
	{
		while (true)
		{
			System.out.println(aNumberBox.getNumber());
		}
    }

}
