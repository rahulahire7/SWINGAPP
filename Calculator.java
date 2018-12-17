import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Calculator  implements ActionListener 
{
	JFrame frm;
	JPanel pnl;
	
	JLabel lno1,lno2,lans;
	JTextField tno1,tno2,tans;
	JButton badd,bsub,bmul,bdiv,bmod,breset,bexit;
	
	public Calculator(){
		frm=new JFrame("Calculator Ver 2019");
		frm.setSize(400,400);
		frm.setVisible(true);
		
		pnl=new JPanel();
		frm.add(pnl);
		pnl.setBackground(Color.magenta);
	
		GridLayout gl=new GridLayout(7,2); 
		pnl.setLayout(gl);
		
		
		lno1=new JLabel("Number1");
		lno2=new JLabel("Number2");
		lans=new JLabel("Ans is ");
		tno1=new JTextField(10);
		tno2=new JTextField(10);
		tans=new JTextField(10);
		
		Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC, 24);
		tans.setFont(f1);
		lans.setFont(f1);
		
		tans.setForeground(Color.RED);
		tans.setBackground(Color.yellow);
		
		badd=new JButton("+");
		bsub=new JButton("-");
		breset=new JButton("C");
		bexit=new JButton("EXIT");
	
		
		pnl.add(lno1);
		pnl.add(tno1);
		pnl.add(lno2);
		pnl.add(tno2);
		pnl.add(lans);
		pnl.add(tans);
		
		pnl.add(badd);
		pnl.add(bsub);
		pnl.add(breset);
		pnl.add(bexit);
		
		badd.addActionListener(this);
		bsub.addActionListener(this);
		breset.addActionListener(this);
		bexit.addActionListener(this);
		
	
	}
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==badd){
					String s1=tno1.getText();
					String s2=tno2.getText();
				
					int n1=Integer.parseInt(s1);
					int n2=Integer.parseInt(s2);
					
					int ans=n1+n2;
					tans.setText(Integer.toString(ans));
					Math.sin(Integer.parseInt(tno1.getText()));
			}
			if(e.getSource()==breset){
				tno1.setText("");
				tno2.setText("");
				tans.setText("");
			}
			if(e.getSource()==bexit){
				System.exit(0);
			}
	}
	
	

}
