package W2A3Q1;




import java.text.DecimalFormat;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class MetricConversion extends JFrame{
	
	private JTextField txt_mile;
	private JTextField txt_pound;
	private JTextField txt_gallon;
	private JTextField txt_faranhite;
	private JTextField txt_kilometer;
	private JTextField txt_kilogram;
	private JTextField txt_liter;
	private JTextField txt_centigrade;
	
	private JButton btn_convert;
	
	
	private JLabel lbl_mile;
	private JLabel lbl_pound;
	private JLabel lbl_gallon;
	private JLabel lbl_faranhite;
	private JLabel lbl_kilometer;
	private JLabel lbl_kilogram;
	private JLabel lbl_liter;
	private JLabel lbl_centigrade;
	DecimalFormat df = new DecimalFormat("####.##");
	
	
	
	MetricConversion(){
		setTitle("Metric Conersion Assistance");
		setVisible(true);
		setSize(400,300);
		//setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		txt_mile = new JTextField();
		txt_pound = new JTextField();
		txt_gallon = new JTextField();
		txt_faranhite = new JTextField();
		txt_kilometer = new JTextField();
		txt_kilogram = new JTextField();
		txt_liter = new JTextField();
		txt_centigrade = new JTextField();
		
		lbl_mile = new JLabel("Mile");
		lbl_pound = new JLabel("Pound");
		lbl_gallon = new JLabel("Gallon");
		lbl_faranhite = new JLabel("Faranhite");
		lbl_kilometer = new JLabel("kilometer");
		lbl_kilogram = new JLabel("Kilogram");
		lbl_liter = new JLabel("Liter");
		lbl_centigrade = new JLabel("Centigrade");
		
		
		btn_convert = new JButton("Convert");
		
		lbl_mile.setBounds(10,10,100,20);
		lbl_pound.setBounds(10,40,100,20);
		lbl_gallon.setBounds(10,70,100,20);
		lbl_faranhite.setBounds(10,100,100,20);
		
		lbl_kilometer.setBounds(300,10,100,20);
		lbl_kilogram.setBounds(300,40,100,20);
		lbl_liter.setBounds(300,70,100,20);
		lbl_centigrade.setBounds(300,100,100,20);
		
		txt_mile.setBounds(120,10,100,20);
		txt_pound.setBounds(120,40,100,20);
		txt_gallon.setBounds(120,70,100,20);
		txt_faranhite.setBounds(120,100,100,20);
		
		
		txt_kilometer.setBounds(410,10,100,20);
		txt_kilogram.setBounds(410,40,100,20);
		txt_liter.setBounds(410,70,100,20);
		txt_centigrade.setBounds(410,100,100,20);
		
		btn_convert.setBounds(200,140,150,20);
		
		add(txt_mile);
		add(txt_pound);
		add(txt_gallon);
		add(txt_faranhite);
		add(txt_kilometer);
		add(txt_kilogram);
		add(txt_liter);
		add(txt_centigrade);
		
		add(lbl_mile);
		add(lbl_pound);
		add(lbl_gallon);
		add(lbl_faranhite);
		add(lbl_kilometer);
		add(lbl_kilogram);
		add(lbl_liter);
		add(lbl_centigrade);
		
		add(btn_convert);
		
		btn_convert.addActionListener(
				evt->{
						
						try {
							double km = Double.parseDouble(txt_mile.getText()) * 1.609;
						
							txt_kilometer.setText((df.format(km)));
						} catch (NumberFormatException ex) {
							//JOptionPane.showMessageDialog(null,"mile can not be empty");
							txt_mile.setText(Double.toString(0.0));
							
						}
						try {
							double kg = Double.parseDouble(txt_pound.getText()) * 0.453592;
							txt_kilogram.setText(df.format(kg));
						} catch (NumberFormatException ex) {
							
							txt_pound.setText(Double.toString(0.0));
						}
					
						
						try {
							double liter = Double.parseDouble(txt_gallon.getText()) * 3.78541;
							txt_liter.setText(df.format(liter));
						} catch (NumberFormatException ex) {
							
							txt_gallon.setText(Double.toString(0.0));
						}
					
					
						try {
							double celcius = (Double.parseDouble(txt_faranhite.getText()) - 32) * 5/9;
							txt_centigrade.setText(df.format(celcius));
						} catch (NumberFormatException ex) {
							// TODO Auto-generated catch block
							txt_faranhite.setText(Double.toString(0.0));
						}
						
					}
				);
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MetricConversion metric = new MetricConversion();

	}

}
