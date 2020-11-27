import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class MultiThrading  extends  JFrame  implements  Runnable
{
	 int x,y=0;
	  int x1,y1=800;
	  Thread  t1,t2,t3;
	  String s="red";
	
	public  MultiThrading() throws InterruptedException
	{
  //   x=1000;
      x1=800;
 // Thread  t1,t2;
    t1=  new  Thread(this);
    t2=new Thread(this);
    t3=new  Thread(this);
     t1.start();	
	t2.start(); 
	t3.start();
	//t1.join();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
	while(true)

	 {
		
		try
		{
		 if(Thread.currentThread()==t1)
		 {
			// x++;
		if(x!=400  )
	      x++;
		// System.out.println(x);

		if(x==400  &&  s.equals("green"))
		  x++;
		if(x==400  &&  s.equals("red"))
			x=400;
		
	//	if()
		 repaint();
		 Thread.sleep(10);
		 }
		
		
		 
			if(Thread.currentThread()==t2) 
			{
				 
			  if(x1!=500)
			  
			    x1--;
			  
			  if(x1==500  &&  s.equals("red"))
				  x=500;
			  if(x1==500  &&  s.equals("green"))
				  x1--;
				//repaint();
			  
//				try {
					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block    
//					e.printStackTrace();
//				}
		    }
			
			
			
			if(Thread.currentThread()==t3)
			{
				s="green";
				Thread.sleep(1000);
				s="red";
				Thread.sleep(10000);
			}
			
		}
			catch(Exception  e)
			{
				e.printStackTrace();
			}
		//repaint(); 
	 }
		
	}

	
	public  void paint(Graphics   g)
	{
		  super.paint(g);
		//buses
	 g.draw3DRect(x,100,100, 100, true);//  here  first  to  attributes  are  dor  setting  position
	 g.drawOval(0, 200, 20, 20);                                       //  while  next  two  attributes  shows  hiight  and  width 
	 g.drawOval(80, 200, 20, 20);                    //  of  object
	 g.drawString("heena",0 , 120);
	 g.draw3DRect(x1, 200, 100, 100,true);
	 g.drawOval(800,300, 20, 20);
	// g.setColor(Color.red);
	 g.drawOval(880, 300, 20, 20);
	 g.drawString("second bus", 800,220);
	 
	 //  first signals
	 g.drawOval(400,50, 20, 20);
	// g.setColor(Color.green);
	 g.drawOval(400, 80, 20, 20);
	// g.setColor(Color.green);
	 // second  signals
	g.drawOval(600, 50, 20, 20);
	//g.setColor(Color.green);
	g.drawOval(600, 80, 20, 20);
	//g.setColor(Color.green);
	
	
	  if(s.equals("red"))    //flag
	  {
		  
		  g.setColor(Color.red);
		  g.fillOval(400, 50, 20, 20);
		  g.fillOval(600, 80, 20, 20);
	  }
	
	  
	  if(s.equals("green"))    //flag
	  {
		  g.setColor(Color.green);
		  g.fillOval(400, 50, 20, 20);
		  g.fillOval(600, 80, 20, 20);
	  }
	
	 
	}
	
	public   void  methodtocallpaint()
	{
		repaint();
	}
	
	
	public  static  void  main(String  args[])  throws  InterruptedException
	{
		MultiThrading  m=new  MultiThrading();
		m.setSize(1000,1000);
		m.setVisible(true);
//        Thread  t1=  new  Thread(this);
//		t1.start();
//		Thread  t2=new Thread(this);
//		 t2.start();  
//		t1.join();
		
	}
	
	
	
}
