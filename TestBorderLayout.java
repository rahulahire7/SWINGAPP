import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
public class TestBorderLayout extends JFrame implements ActionListener
{

	JButton b1,b2,b3,b4;
	JTextField tf;
	TestBorderLayout(){
		super("Border Layout");
		setSize(400,400);
		setVisible(true);

		/*BorderLayout bl=new BorderLayout();
		setLayout(bl);
		 */
		setLayout(new BorderLayout());
		/*b1=new JButton("First");
		b2=new JButton("Second");
		b3=new JButton("Third");
		b4=new JButton("Fourth");
		 */


		tf=new JTextField(20);

		/*	add(b1,BorderLayout.SOUTH);
		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.WEST);
		add(b2,BorderLayout.CENTER);*/
		add(tf,BorderLayout.NORTH);
		JPanel p1=new JPanel();
		add(p1,BorderLayout.CENTER);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setLayout(new GridLayout(3,3));
		for(int i=1;i<10;i++){
			JButton b=new JButton(Integer.toString(i));
			b.addActionListener(this);
			p1.add(b);	
		}
	}
	public static void main(String[] args) {
		new TestBorderLayout();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		System.out.println(str);
		if(str.equals("1")){
			str=str+tf.getText();
			tf.setText(str);
		}
	}
}
