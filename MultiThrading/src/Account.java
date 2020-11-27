import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Account  extends BauntnKAcco implements Runnable {

	int   money=500;
	Thread t1,t2;
	//int  balance=10000;
    int  balance;  
	BauntnKAcco   b;
	Lock  l=new ReentrantLock();
	public  Account(BauntnKAcco  b) 
	{
		this.b=b;
		t1=new Thread(this);
		t2=new Thread(this);
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
	}
	
	public  synchronized void deposite(int  money)
	{
	l.lock();
	 balance=b.getBalance();
	 balance= balance+money;
	 b.setBalance(balance);
	 System.out.println("balance  after  deposite &&&" + Thread.currentThread().getName() +" \t &*&  \t " +b.getBalance());
	 l.unlock();
	}
	  public   synchronized  void  withdraw(int  money)
	  {
		  
		  l.lock();
		 balance =b.getBalance(); 
		 balance=balance-money;
		 b.setBalance(balance);
		 System.out.println("after  withdraw \t" + Thread.currentThread().getName() +" "+ b.getBalance());
		 l.unlock();
	  }
	
	public static void main(String[] args) {
		//BauntnKAcco   b=new BauntnKAcco();
		Account  a=new Account(new   BauntnKAcco());
		//a.deposite(500);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
		for(  int i=0;i<10;i++)
		{
	if(Thread.currentThread()==t1)
	{
		deposite(500);
		
			Thread.sleep(1000);
		
		//System.out.println();
	}
	if(Thread.currentThread()==t2)
	{
	//	deposite(1400);
		withdraw(1000);
		Thread.sleep(1000);
	}
		}
		}
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
}
