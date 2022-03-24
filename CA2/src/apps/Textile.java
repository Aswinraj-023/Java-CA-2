//Unique ID : E7321008
package apps;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Textile extends Applet implements ActionListener{
	 int i,p,q,r;
	 Label lab=new Label("CUSTOMER BILL INFORMATION");
	 Label l1=new Label("NAME");
	 Label l2=new Label("PRODUCT CODE");
	 Label l3=new Label("PRODUCT CATEGORY");
	 Label l4=new Label("PRICE");
	 Label l5=new Label("QUANTITY");
	 TextField t1=new TextField();
	 TextField t2=new TextField();
	 TextField t3=new TextField();
	 Choice ch1=new Choice();
	 Choice ch2=new Choice();
	 List ls=new List();
	 Button b=new Button("BILL");
	 public void init()
	 {
	  this.setLayout(null);
	  this.setBackground(Color.green);
	  lab.setBounds(500,20,300,50);
	  l1.setBounds(100,100,200,40);
	  l2.setBounds(100,200,200,40);
	  l3.setBounds(100,300,200,40);
	  l4.setBounds(100,400,200,40);
	  l5.setBounds(100,500,200,40);
	  add(lab);
	  add(l1);
	  add(l2);
	  add(l3);
	  add(l4);
	  add(l5);
	  t1.setBounds(300,100,200,50);
	  t2.setBounds(300,200,200,50);
	  t3.setBounds(300,400,200,50);
	  add(t1);
	  add(t2);
	  add(t3);
	  b.setBounds(200,580,90,60);
	  add(b);
	  ls.setBounds(900,300,300,300);
	  add(ls);
	  ch1.setBounds(300,300,200,40);
	  ch1.add("WRIST BAND");
	  ch1.add("TRIMMER");
	  ch1.add("AIR PODS");
	  add(ch1);
	  ch2.setBounds(300,500,200,40);
	  for(i=0;i<=10;i++)
	  {
	   ch2.add(String.valueOf(i));
	  }
	  add(ch2);
	  b.addActionListener(this);
	     }
	  public void actionPerformed(ActionEvent arg0)
	 {
	  p=Integer.parseInt(t3.getText());
	  q=Integer.parseInt(ch2.getSelectedItem());
	  r=p*q;
	  ls.add(l1.getText()+"-"+t1.getText());
	  ls.add(l2.getText()+"-"+t2.getText());
	  ls.add(l3.getText()+"-"+ch1.getSelectedItem());
	  ls.add(String.valueOf(r));
	   }
	}


