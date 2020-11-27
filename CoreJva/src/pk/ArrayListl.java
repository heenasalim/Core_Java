package pk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListl
{
  static 	int  a[]=new int[5];   //  i  cannot  give  size   direx=ctly  to  array  for that  i  should  create  new  array 
	                          //with  new  keyword
 	public ArrayListl()
 	{
		// TODO Auto-generated constructor stub
	}
	     
 	public  static void   subListDemo()
 	{
 	
	Scanner  s=new Scanner(System.in);

	   SortedSet<Integer> h1=new TreeSet<Integer>();  

	   SortedSet<Integer> h2=new TreeSet<Integer>();  
	  List<Integer>  a=new  ArrayList<Integer>(20);
	  for(int  j=0;j < 6;j++)                      // i  can  ass  only  collection  to   set,array  and  all/	    {
	{
		a.add(s.nextInt());
	//	h1.add(s.nextInt());
     //
	}
	

   List  l=new  ArrayList();
   
//   for(int  x=0;x<a.size();x++)
//   {
//
// 		System.out.println("list  values  are" + a.get(x)); 
//   }

   
   int   i=0;
  for(int  x=0;x<a.size()-1;x++)
  {   
	 // x++;
	 //int  i=0;
	// i=a.indexOf(x+1);
	 if(a.get(x) >  a.get(x+1) )
	 {  
		
		//list  l= Collections.sort(a.subList(0,x+1)) 
		 // h2.addAll(h1.subSet(0, x+1));
     Collections.sort(a.subList(0,x+1));
	
	
	  l.add(a.subList(0,x+1));

	 // i=a.indexOf(x);
	 // x++;
	  System.out.println(a.indexOf(x));
	// x=x+i;
			//System.out.println(a.get(x)); 
	 
	 }
	// x=i;
	else
	 if( a.get(x) < a.get(x+1))
	 { 
		 //l.add();
		// i++; 
		 x++;
		
	 } 
	
	 
	  
  }

Iterator  i2=h1.iterator();
while(i2.hasNext())
{
	System.out.println("values  by  sorted  map  is" + i2);
}
  for(int  x=0;x<l.size();x++)
  {

	
		System.out.println("sublist  values  are" + l.get(x)); 
  }

 Set<String>  s1=new HashSet<String>();
 s1.add("heena");
 s1.add("how  are  u");
 s1.add("i am  fine");
 s1.add("heena");
 Iterator  i1=s1.iterator();
 while(i1.hasNext())
 {
	 System.out.println("values  in  the  set  are" +  i1.next());
 }
  
  //TreeSet<Integer>   h=new HashSet<Integer>();
 
  SortedSet<Integer>  h=new   TreeSet<Integer>();
  h.add(1);
  h.add(5);
  h.add(1);
  h.add(2);
Iterator<Integer>  i11=h.iterator();
while(i11.hasNext())
{
	   System.out.println("values"  +  i11.next());
//	//String elements=(String) i.next();
//	//System.out.println("values  of  set   are"  + elements);
}
   
	//sSystem.out.println(s);
	
	
	
//  for(int i=0;i<a.length;i++)
//  {
//	System.out.println("enter  the  elements");
//   a[i]= s.nextInt();
//  //   Collection  a={1,2 ,8,3,4,7,5,6,3,1,2};
//   System.out.println("elemnt   at   position"  +  i + "is" + a[i]);
//  }
	
	
	
	   // System.out.println("the contents  of the sets  are" + h.toString())
        // List  l=new  ArrayList(20);
	   
 	}
 	
 	public  static  void  main(String  args[])
 	{   
 		ArrayListl  ar=new ArrayListl();
 		ar.subListDemo();
 		
 		
 	}
}
