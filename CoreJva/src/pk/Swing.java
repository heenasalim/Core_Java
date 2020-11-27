package pk;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import   javax.swing.*;

public class Swing   implements MouseListener, ActionListener{

	/**
	 * @param args
	 */
	
	JPanel   p;
	JPanel  p1;
	JPanel   p2;
	JFrame  f;
	JMenuBar  mb;
	JMenu     m;
	JMenuItem   Basic;
	JMenuItem   Scientific;
	JMenuItem    calculate;
	JTextField     text;
	JButton   b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	JComboBox    c1;
	JList  l;
	JCheckBox   cb;
	JRadioButton   r;
	JSeparator   js;
	JCheckBoxMenuItem  cbm;
	JRadioButtonMenuItem  rbm;
	JPopupMenu  pm;
	JDialog  d;
	JFileChooser   fc;
	JColorChooser  jc;
	JProgressBar   jp;
	JToolTip  jt;
	JToolBar  jb;
	JTree  tree;
	JSpinner  sp;
	double  a,b;
	double result=0.0;
	int op;
	String re="",ah;
	
public    Swing()
{
	p=new  JPanel();
	p1=new  JPanel();
	p2=new  JPanel();
	f=new  JFrame("Calculator");
	mb=new  JMenuBar(); 	
	m=new  JMenu("Calc  Type");	
	Basic=new  JMenuItem("Basic");
	Scientific=new JMenuItem("Scientific");
	calculate=new  JMenuItem();
	
	m.add(Basic);
	m.add(Scientific);
	m.add(calculate);
	//f.setMenuBar(/)
	mb.add(m);
	f.setJMenuBar(mb);
    text=new  JTextField(20);
	  b1=new JButton("1");
	  b2=new  JButton("2");
	  b3=new JButton("3");
	  b4=new JButton("4");
	  b5=new JButton("5");
	  b6=new  JButton("6");
	  b7=new JButton("7");
	  b8=new JButton("8");
	  b9=new JButton("9");
	  b10=new JButton("*");
	  b11=new JButton("(/)");
	  b12=new JButton("+");
	  b13=new JButton("(-)");
	  b14=new JButton("=");
	  b15=new JButton("%");
	  b16=new JButton("(1/x)");
	  b17=new JButton("root");
	  b18=new JButton("Delete");
	  b19=new JButton("Clear");
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  b4.addActionListener(this);
	  b5.addActionListener(this);
	  b6.addActionListener(this);
	  b7.addActionListener(this);
	  b8.addActionListener(this);
	  b9.addActionListener(this);
	  b10.addActionListener(this);
	  b11.addActionListener(this);
	  b12.addActionListener(this);
	  b13.addActionListener(this);
	  b14.addActionListener(this);
	  b15.addActionListener(this);
	  b16.addActionListener(this);
	  b17.addActionListener(this);
	  b18.addActionListener(this);
	  b19.addActionListener(this);
//	  b10.addActionListener(this);
//	  b11.addActionListener(this);
//	  b12.addActionListener(this);
//	  b13.addActionListener(this);
	  String  a[]={"calculate  difference  between  two  dates","Add  days  r  subtract  Days"};
	  c1=new JComboBox(a);
	  p1.add(c1);
      sp=new JSpinner();
      tree=new   JTree();
      p.add(tree);
     // fc=new  JFileChooser();
   //   p.add(fc);
     // jc=new JColorChooser();
    //  p.add(jc);
      p1.add(sp);
	  p.add(text);
	  p.add(b1);

	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	 p.add(b6);
	 p.add(b7);
	 p.add(b8);
	 p.add(b9);
	 p.add(b10);
	 p.add(b11);
	 p.add(b12);
	 p.add(b13);
	 p.add(b14);
	 p.add(b15);
	 p.add(b16);
	 p.add(b17);
	 p.add(b18);
	 p.add(b19);
	//  p.add(mb);
	  f.add(p);
	 //  f.add(p1);
	  f.setVisible(true);
	  f.setSize(500,600);
	
}

public  static  void  main(String  args[])
{
	Swing  s=new  Swing();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{    
		String  s=b1.getText();	
		text.setText(text.getText().concat(s));
	}
	if(e.getSource()==b2)
	{
		String s=b2.getText();
		text.setText(text.getText().concat("2"));
	}
	
	if(e.getSource()==b3)
	{
		String  s=b3.getText();
       text.setText(text.getText().concat("3"));
	}
	if(e.getSource()==b4)
	{
		String  s=b4.getText();
       text.setText(text.getText().concat("4"));
	}
	if(e.getSource()==b5)
	{
		String  s=b5.getText();
       text.setText(text.getText().concat("5"));
	}
	if(e.getSource()==b6)
	{
		String  s=b6.getText();
       text.setText(text.getText().concat("6"));
	}
	if(e.getSource()==b7)
	{
		String  s=b7.getText();
       text.setText(text.getText().concat("7"));
	}
	if(e.getSource()==b8)
	{
		String  s=b8.getText();
       text.setText(text.getText().concat("8"));
	}
	
	if(e.getSource()==b9)
	{
		String  s=b9.getText();
       text.setText(text.getText().concat("9"));
	}
	
	if(e.getSource()==b10)
	{
		//String  s=b10.getText();
       //text.setText(text.getText().concat("*"));
		a=Double.parseDouble(text.getText());
		text.setText("");
		
	}
	if(e.getSource()==b11)
	{
	//	String  s=b11.getText();
      // text.setText(text.getText().concat("/"));
		a=Double.parseDouble(text.getText());
		text.setText("");
		op=4;
	}
	if(e.getSource()==b12)
	{
		//String  s=b14.getText();
       //text.setText(text.getText().concat("+"));
		
		
      a=Double.parseDouble(text.getText());
       op=1;
       text.setText("");
	}

//
if(e.getSource()==b13)
{
	String  s=b13.getText();
  // text.setText(text.getText().concat("-"));
  // text.setText("");
   a=Double.parseDouble(text.getText());
   op=2;
   text.setText(""); 
}

	if(e.getSource()==b14)
	{
      
		String  s=b12.getText();
      //text.setText(text.getText().concat("=")xt);
		b=Double.parseDouble(text.getText());
		
		switch(op)
		{
		case  1:
	    result=a+b;
	    break;
		case 2:
	   result=a-b;
	    break;
		case  3:
     	result=a*b;
		case  4:
	    result=a/b;
		case  5:
		result=a%b;
		break;
		case  6:
	   result=1/a;
		//case 7:
	   // result=  a  root b;
		}
	//  String re=String.valueOf(result);
      text.setText("" +result);
	}
	if(e.getSource()==b15)
	{
	//	String  s=b15.getText();
     //  text.setText(text.getText().concat("%"));
      op=4;
       Double a=Double.parseDouble(text.getText());
       text.setText("");
	}
	if(e.getSource()==b16)
	{
	//	String  s=b16.getText();
      // text.setText(text.getText().concat("(1/x)"));
		op=6;
     //  text.setText("");
       a=Double.parseDouble(text.getText());
       
	}
	
//	if(e.getSource()==b17)
//	{
//	//	String  s=b17.getText();
//      // text.setText(text.getText().concat("(root)"));
//	}
	if(e.getSource()==b18)
	{
		String  s=b18.getText();
      // text.setText(text.getText().concat("root"));
        String  del= text.getText();
       List<String>  l=new  ArrayList<String>();
       List<String>  a=new  ArrayList<String>();
       
         //String  s1[]={text.getText()};
         String s12=text.getText();
         text.setText("");
       for(  int   i=0;i<s12.length()-1;i++)
       {
    	   
           text.setText(text.getText()+s12.charAt(i));
    	     
    	   
       }
       
       
       
       
       
       
      // Double a=Double.parseDouble(text.getText());
      
//       for(int  x=0;x<l.size();x++)
//       {
//
//    	    text.setText(l.get(x));
//     		System.out.println("sublist  values  are" + l.get(x)); 
//       }

       
	    }
       
if(e.getSource()==b19)
	{		String  s=b19.getText();
       text.setText("");
	}
//	if(e.getSource()==b20)
//	{
//		String  s=b20.getText();
    //   text.setText(s);
	//}
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	b1.setBackground(Color.pink);
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	b1.setBackground(Color.pink);
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	b1.setBackground(Color.pink);
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
	b1.setBackground(Color.pink);
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		
//	}

}
