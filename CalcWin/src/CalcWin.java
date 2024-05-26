import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalcWin extends JFrame implements ActionListener
{
	private JTextField txtNombre = new JTextField(); 
	
	private JButton bt0 = new JButton("0"); 
	private JButton bt1 = new JButton("1"); 
	private JButton bt2 = new JButton("2"); 
	private JButton bt3 = new JButton("3"); 
	private JButton bt4 = new JButton("4"); 
	private JButton bt5 = new JButton("5"); 
	private JButton bt6 = new JButton("6"); 
	private JButton bt7 = new JButton("7"); 
	private JButton bt8 = new JButton("8"); 
	private JButton bt9 = new JButton("9"); 
	
	private JButton btPoint = new JButton("."); 
	
	private JButton btPlus = new JButton("+"); 
	private JButton btMoins = new JButton("-"); 
	private JButton btMult = new JButton("*"); 
	private JButton btDiv = new JButton("/"); 
	private JButton btEgal = new JButton("="); 
	private JButton btInverse = new JButton("1/x"); 
	private JButton btModulo = new JButton("%"); 
	
	private JButton btEffacer = new JButton("<-"); 
	private JButton btCE = new JButton("CE"); 
	private JButton btMoinsPlus = new JButton("-/+"); 
	private JButton btCarre = new JButton("x2");
	private JButton btRacine= new JButton("R"); 
	
	public CalcWin ()
	{
		this.setTitle("Ma Calc Win 2023");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.cyan);
		this.setBounds(100, 100, 320, 430);
		this.setLayout(null);
		
		this.txtNombre.setBounds(10, 20, 280, 50);
		this.add(this.txtNombre);
		
		this.btEffacer.setBounds(10, 90, 50, 50);
		this.add(this.btEffacer);
		this.btCE.setBounds(70, 90, 50, 50);
		this.add(this.btCE);
		this.btMoinsPlus.setBounds(130, 90, 50, 50);
		this.add(this.btMoinsPlus);
		this.btCarre.setBounds(190, 90, 50, 50);
		this.add(this.btCarre);
		this.btRacine.setBounds(250, 90, 50, 50);
		this.add(this.btRacine);
		
		
		this.bt7.setBounds(10, 150, 50, 50);
		this.add(this.bt7);
		this.bt8.setBounds(70, 150, 50, 50);
		this.add(this.bt8);
		this.bt9.setBounds(130, 150, 50, 50);
		this.add(this.bt9);
		
		this.bt4.setBounds(10, 210, 50, 50);
		this.add(this.bt4);
		this.bt5.setBounds(70, 210, 50, 50);
		this.add(this.bt5);
		this.bt6.setBounds(130, 210, 50, 50);
		this.add(this.bt6);
		
		this.bt1.setBounds(10, 270, 50, 50);
		this.add(this.bt1);
		this.bt2.setBounds(70, 270, 50, 50);
		this.add(this.bt2);
		this.bt3.setBounds(130, 270, 50, 50);
		this.add(this.bt3);
		
		this.bt0.setBounds(10, 330, 110, 50);
		this.add(this.bt0);
		this.btPoint.setBounds(130, 330, 50, 50);
		this.add(this.btPoint);
		
		this.btPlus.setBounds(190, 330, 50, 50);
		this.add(this.btPlus);
		this.btMoins.setBounds(190, 270, 50, 50);
		this.add(this.btMoins);
		this.btMult.setBounds(190, 210, 50, 50);
		this.add(this.btMult);
		this.btDiv.setBounds(190, 150, 50, 50);
		this.add(this.btDiv);
		
		this.btModulo.setBounds(250, 150, 50, 50);
		this.add(this.btModulo);
		this.btInverse.setBounds(250, 210, 50, 50);
		this.add(this.btInverse);
		this.btEgal.setBounds(250, 270, 50, 110);
		this.add(this.btEgal);
		
		//rendre les boutons ecoutables 
		this.bt0.addActionListener(this);
		
		
		this.setVisible(true);
	}
	public static void main (String args[])
	{
		CalcWin uneCalc = new CalcWin(); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.bt0) {
			this.txtNombre.setText(this.txtNombre.getText() + "0");
		}
		
	}
}
