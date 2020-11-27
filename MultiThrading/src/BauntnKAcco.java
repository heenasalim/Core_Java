
public class BauntnKAcco 
{
    
	
	private int balance;
	public  BauntnKAcco()
	{
		  balance=10000;
	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

     public  static  void  main(String  args[])  
    
     {
    	 BauntnKAcco  b=new BauntnKAcco();
    	System.out.println(b.getBalance());
     }
     }
  