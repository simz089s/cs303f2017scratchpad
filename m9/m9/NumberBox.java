package m9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberBox
{
	private int aNumber;
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	
	public NumberBox()
	{
		aNumber = 0;
	}
	
	public void increment()
	{
		lock.lock();
		try
		{
			aNumber++;
			condition.signalAll();
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public int getNumber()
	{
		lock.lock();
		try
		{
			condition.await();
			return aNumber;
		}
		catch (InterruptedException e)
		{
			return aNumber;
		}
		finally
		{
			lock.unlock();
		}
	}
	
}
