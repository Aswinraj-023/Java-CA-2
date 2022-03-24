//Unique ID : E7321008 
package apps;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncomeTax extends Applet implements ActionListener {
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	TextField t6=new TextField();
	TextField t7=new TextField();
	
	Button b1;
	
	public void init() {
		
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		
		t1.setBounds(250,40,100,20);
		t2.setBounds(250,70,100,20);
		t3.setBounds(250,100,100,20);
		t4.setBounds(250,130,100,20);
		t6.setBounds(250,160,100,20);
		t7.setBounds(250,220,100,20);
		
		Font myFont = new Font("Serif",Font.BOLD,15);
		Label l1=new Label("Enter the Name ");
		
		 l1.setFont(myFont);
		l1.setBounds(20,40,200,20);
		
		
		Label l2=new Label("Entre the Pan Card number ");
		 l2.setFont(myFont);
		l2.setBounds(20,70,200,20);
		
		
		Label l3=new Label("Enter the Mobile Number ");
	    l3.setFont(myFont);
		l3.setBounds(20,100,200,20);
		
		Label l4=new Label("Enter the Income");
		l4.setFont(myFont);
		l4.setBounds(20,160,200,20);

		
		
		Label l5=new Label("Enter the Year");
		 l5.setFont(myFont);
		l5.setBounds(20,130,200,20);
		
		Label l6=new Label("Tax to Pay");
		 l6.setFont(myFont);
		l6.setBounds(180,220,70,20);
		
		
		b1 = new Button("Calculate");
	     b1.setBounds(370,160,100,20);
	      add(b1);
		
	      
	      b1.addActionListener(this);
	      
	      
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		t3.addActionListener(this);
		add(t5);
		add(l5);
		add(t4);
		add(t6);
		add(l4);
		add(l6);
		add(t7);
	}
 public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String num=t3.getText();
double tax=0;
		Double it=Double.parseDouble(t6.getText());
		
		
		if(it<=200000)
			tax=0;
		else if(it<=300000)
			tax=0.1*(it-200000);
		else if(it<=500000)
			tax=(0.2*(it-300000))+(0.1*100000);
		else if(it<=1000000)
			tax=(0.3*(it-500000))+(0.2*200000)+(0.1*100000);
		else
			tax=(0.4*(it-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
t7.setText(Double.toString(tax));
}}