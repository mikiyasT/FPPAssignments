package W2A2Q2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RainbowColors extends JFrame implements ActionListener{

	private JButton btn_red;
	private JButton btn_yellow;
	private JButton btn_green;
	private JButton btn_blue;
	private JButton btn_magenta;
	private JButton btn_purple;
	private JButton btn_lpurple;
	private final int BTN_WIDTH = 60;
	final int BTN_HEIGHT = 70;
	private int origX = 0;
	private int origY = 0;
	RainbowColors(){
		setTitle("Rainbow color frame");
		//setLayout(new FlowLayout(FlowLayout.LEADING));
		setLayout(null);
		setVisible(true);
		setBounds(0,0,400,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_red = new JButton();
		btn_green = new JButton();
		btn_blue = new JButton();
		btn_magenta = new JButton();
		btn_yellow = new JButton();		
		btn_purple = new JButton();
		btn_lpurple = new JButton();
		
		
		btn_red.setBounds(origX,origY,BTN_WIDTH,BTN_HEIGHT);
		btn_yellow.setBounds(origX + BTN_WIDTH,origY,BTN_WIDTH,BTN_HEIGHT);
		btn_purple.setBounds(origX + 2*BTN_WIDTH,origY,BTN_WIDTH,BTN_HEIGHT);
		btn_lpurple.setBounds(origX + 3*BTN_WIDTH,origY,BTN_WIDTH,BTN_HEIGHT);
		btn_magenta.setBounds(origX + 4*BTN_WIDTH,origY,BTN_WIDTH,BTN_HEIGHT);
		btn_green.setBounds(origX + 5*BTN_WIDTH,origY,BTN_WIDTH,BTN_HEIGHT);
		btn_blue.setBounds(origX + 6*BTN_WIDTH,origY,BTN_WIDTH,BTN_HEIGHT);
		
		btn_red.setBackground(Color.RED);
		btn_yellow.setBackground(Color.YELLOW);
		btn_purple.setBackground(Color.PINK);
		btn_lpurple.setBackground(Color.CYAN);
		btn_magenta.setBackground(Color.magenta);
		btn_green.setBackground(Color.GREEN);
		btn_blue.setBackground(Color.BLUE);
		
		add(btn_red);  add(btn_green);	add(btn_blue);	add(btn_magenta);
		add(btn_purple);	add(btn_lpurple);	add(btn_yellow);
		
		btn_red.addActionListener(this);
		btn_green.addActionListener(this);
		btn_blue.addActionListener(this);
		btn_magenta.addActionListener(this);
		btn_purple.addActionListener(this);
		btn_lpurple.addActionListener(this);
		btn_yellow.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainbowColors RC = new RainbowColors();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		
		if(btn == btn_red )
			JOptionPane.showMessageDialog(null,"Red is the symbol of blood","Color information",JOptionPane.INFORMATION_MESSAGE);
		if( btn == btn_blue)
			JOptionPane.showMessageDialog(null,"Blue is the symbol of Universalness","Color information",JOptionPane.INFORMATION_MESSAGE);
		if(btn == btn_yellow)
			JOptionPane.showMessageDialog(null,"Yellow is the symbol of trust","Color information",JOptionPane.INFORMATION_MESSAGE);
		if(btn == btn_green)
			JOptionPane.showMessageDialog(null,"Green is the symbol of richness","Color information",JOptionPane.INFORMATION_MESSAGE);
		if(btn ==  btn_magenta)
			JOptionPane.showMessageDialog(null,"Magenta is the symbol of Love","Color information",JOptionPane.INFORMATION_MESSAGE);
		if(btn == btn_purple)
			JOptionPane.showMessageDialog(null,"Purple is the symbol of Friendship","Color information",JOptionPane.INFORMATION_MESSAGE);
		if(btn == btn_lpurple) 
			JOptionPane.showMessageDialog(btn_lpurple,"Light purple is the symbol of hope","Color information",JOptionPane.INFORMATION_MESSAGE);
				
	}

}
