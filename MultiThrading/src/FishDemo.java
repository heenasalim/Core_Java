import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class FishDemo   extends JFrame   implements Runnable,MouseListener{
     Thread  t1,t2,t3,t4,t5;
     int  x=110;
	  int  y,y1,y2,y3,y4=500;
	  int  x1=200;
	  int x2=200;
	  int x3=400;
	  int  x4=300;
	  int  x5=0;
	  int  marks=0;
	 // int  
	  public FishDemo()
	  {
		  t1=new  Thread(this);
		  t2=new Thread(this);
		  t3=new Thread(this);
		  t4=new Thread(this);
		    t5=new  Thread(this);
		  t1.start();
		  t2.start();
		  t3.start();
		  t4.start();
		  t5.start();
	  }
	 public static void main(String[] args) {
		  FishDemo  f=new FishDemo();
		  f.setSize(500,500);
		  f.setVisible(true);
	}
	
	 
	 public  void  paint(Graphics g)
	 {  
		 super.paint(g);
		 g.drawOval(x,y, 30, 30);
		 g.drawOval(x1, y1, 30, 30);
		 g.drawOval(x2, y2, 30, 30);
		 g.drawOval(x3, y3, 30, 30);
		 g.drawOval(x4, y4, 30, 30);
		 
		// g.drawImage("D://11.jpg", 10, 11,true);
		 g.drawOval(x5, 600, 100, 20);    //fish
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
			if(y!=1000)
			{
		   
		    y++;
		   // Thread.sleep(10);
			}
//		  if(y==600  && y==x5 )
//         {
//		    marks=600;
//		   y=600;
//			}
			repaint();
			Thread.sleep(50);
			}
		
		
			if(Thread.currentThread()==t2)
			{
				//if(y2!=1000)
			
			    y2++;
				//Thread.sleep(100);
				 if(y2==600)
		         {
				    y2=600;
				    synchronized(this)
					{
		//	wait();
				    notifyAll();
					}
				  //  t2.wait();
				 //   marks=600;
				   // y2++;
					}
				//repaint();
			Thread.sleep(10);
			repaint();
			}
				if(Thread.currentThread()==t3)
				{
					if(y3!=1000)
				    y3++;
					repaint();
					Thread.sleep(10);
					
				}
			
			//Thread.sleep(10);
			
				if(Thread.currentThread()==t4)
				{
					if(y4!=1000)
				    y4++;
					//repaint();
					Thread.sleep(10);
					repaint();
				}
		
		
		  // repaint();
		  // try {
			//Thread.sleep(100);
		
		if(Thread.currentThread()==t5)
		{
			
			  x5++;
			  if(x5==200)
			  {
		     // x5++;
		      synchronized(this)
				{
		         wait();
				}
		     // wait();
	        //  t2.notify();
			
			  }
			 // if(t2.isAlive())
			 // {
			//  x5++;
			//  }
			  repaint();
			 // y=300;
//			  Thread.sleep(10);
//			  y1=200;
//				Thread.sleep(10);
//				//Thread.sleep(10);
//			  y4=0;
			  Thread.sleep(20);
		}
		   
			}
	catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			
		}
		
		}
		
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
