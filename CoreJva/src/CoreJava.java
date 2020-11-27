import java.util.Scanner;


public class CoreJava {

	  int  result=0;
	  int  a[]=new  int[15];
	  int   b[]=new int[15];
	  static int empid=0;
	  static  String  collegename="alard";
	
	   public  void  add(int...x)
	   {
		   
		   empid++;
		   System.out.println("employee  id  is  by  employoo  is" + empid);
		   empid=9;
		   
		    for(int  i:x)
		    {
		    	result=result+i;
		    }
		 System.out.println("Addition  of  two  nubers  is" +  result);  
		   
	   }
	   
	   public  void  subtract(int...x)
	   {
		    
		  // empid=10;
		   System.out.println(empid);
		   for(int  i:x)
			  
		   {
			   result=result-i;  
		   }
		   System.out.println("subtraction  of  the  no  is"+  result);
	   }
	   
	   public  void  multiplacation(int...x)
	   {
		   
		   for(int  i:x)
			   
		   {
			   result=result*i;
		   }
		   System.out.println("multiplication  f  the  numbers  is" + result);
	   }
	   
	   
	   public  void  division(int...x)
	   {
		  for(int  i:x)
		  {
			  result=result/i;
		  }
		  System.out.println("division  of  number  is"  +  result);
		   
	   }
	     public  void  switchMethod()
	     {
	    	 int  op=0;
	    	 int  no = 0;
	    	 System.out.println("\n enters  the  operation  u  want  to  perform");
	    	 System.out.println("\n 1:Addition 2:subtraction  3:multiplication  4:division");
	    	 System.out.println(" how  many  numbers  u  have  to  enter");
	    	 System.out.println("enter  the  numbers  on  which  u  want  to  perfoerm  operatin");
	    	 
	    	 Scanner s=new Scanner(System.in);
	    	  op=s.nextInt();
	    	   no=s.nextInt();
	    	   for(int  i=0;i<no;i++)
	    	   {
	           a[i]=s.nextInt();
	    	   }
	    	   //b[no]= s.nextInt();
	    	   switch(op)
	    	   {
	    	   case 1:
	    		   add(a);
	    	       break;
	    	   case  2:
	    		   subtract(a);
	    	   case 3:
	    		   multiplacation(a);
	    		  break;
	    	   case  4:
	    		   division(a);
	    		   break;
	    	   case  5:
	    	  
	    	   }if(op!=5);
	     }
	   public static void main(String[] args) {
		CoreJava  j=new CoreJava();
		j.add(2,3,4);
		CoreJava  j1=new CoreJava();
		j1.subtract(5,10);
		j.switchMethod();
	}   
	   
	   
}
