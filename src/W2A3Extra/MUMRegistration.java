package W2A3Extra;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.scene.control.RadioButton;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class MUMRegistration extends JFrame{
	
	private JTextField txt_fname;
	private JTextField txt_lname;
	private JTextField txt_street;
	private JTextField txt_city;
	private JTextField txt_state;
	private JTextField txt_country;
	private JTextField txt_message;
	
	private JRadioButton rd_male;
	private JRadioButton rd_female;
	
	private JComboBox lst_courses;
	
	
	
	private JCheckBox chk_Morning;
	private JCheckBox chk_Afternoon;
	private JCheckBox chk_Evening;
	
	
	private JLabel lbl_header;
	private JLabel lbl_fname;
	private JLabel lbl_lname;
	private JLabel lbl_street;
	private JLabel lbl_city;
	private JLabel lbl_state;
	private JLabel lbl_country;
	private JLabel lbl_gender;
	private JLabel lbl_courses;
	private JLabel lbl_session;
	
	private JLabel lbl_message;
	
	private JButton btn_submit;
	
	
	private final int COMP_WIDTH = 150;
	final int COMP_HEIGHT = 30;
	private int COMP_origX = 200;
	private int COMP_origY = 100;
	private int VER_GAP = 10;
	private int HOR_GAP = 10;
	
	
	MUMRegistration(){
		setTitle("MUM Course Registration Form");
		setVisible(true);
		setSize(500,800);
		//setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		txt_fname =  new JTextField(null);
		txt_lname =    new JTextField(null);
		txt_street  =  new JTextField(null);
		txt_city  =  new JTextField(null);
		txt_state  =  new JTextField(null);
		txt_country =  new JTextField(null);
		txt_message =  new JTextField(null);
		
		lbl_header = new JLabel("MUM Course Registration Form");
		lbl_fname = new JLabel("First Name");
		lbl_lname = new JLabel("Last Name");
		lbl_street = new JLabel("Street");
		lbl_city = new JLabel("City");
		lbl_state = new JLabel("State");
		lbl_country = new JLabel("Country");
		lbl_gender = new JLabel("Gender");
		lbl_courses = new JLabel("Courses");
		lbl_session = new JLabel("Session");
		lbl_message = new JLabel("Message");
		
		rd_male = new JRadioButton("Male");
		rd_female = new JRadioButton("Female");
		
		chk_Morning = new JCheckBox("Morning");
		chk_Afternoon = new JCheckBox("Afternoon");
		chk_Evening = new JCheckBox("Evening");
		
		
		
		btn_submit = new JButton("Submit");
		String[] courses = {"Java","WAP","EA","ALGO"};
		lst_courses = new JComboBox(courses);
		
		
		lbl_header.setBounds(COMP_origX + COMP_WIDTH ,COMP_origY/2,2 * COMP_WIDTH,COMP_HEIGHT);
		lbl_fname.setBounds(COMP_origX,COMP_origY,COMP_WIDTH,COMP_HEIGHT);
		lbl_lname.setBounds(COMP_origX,COMP_origY + 1 * COMP_HEIGHT + VER_GAP ,COMP_WIDTH,COMP_HEIGHT);
		lbl_street.setBounds(COMP_origX,COMP_origY + 2 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		lbl_city.setBounds(COMP_origX,COMP_origY + 3 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		lbl_state.setBounds(COMP_origX,COMP_origY + 4 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		lbl_country.setBounds(COMP_origX,COMP_origY + 5 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		lbl_gender.setBounds(COMP_origX,COMP_origY + 6 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		lbl_courses.setBounds(COMP_origX,COMP_origY + 7 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		lbl_session.setBounds(COMP_origX,COMP_origY + 8 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		lbl_message.setBounds(COMP_origX,COMP_origY + 9 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		
		
		txt_fname.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY,COMP_WIDTH,COMP_HEIGHT);
		
		txt_lname.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY + 1 * COMP_HEIGHT + VER_GAP ,COMP_WIDTH,COMP_HEIGHT);
		txt_street.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY + 2 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		txt_city.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY + 3 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		txt_state.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY + 4 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		txt_country.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY + 5 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		
		rd_male.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY + 6 *( COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		rd_female.setBounds(COMP_origX  + 2* COMP_WIDTH + HOR_GAP,COMP_origY +6 *( COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		
		lst_courses.setBounds(COMP_origX  + COMP_WIDTH + HOR_GAP,COMP_origY + 7 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		
		chk_Morning.setBounds(COMP_origX + COMP_WIDTH + HOR_GAP,COMP_origY + 8 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		chk_Afternoon.setBounds(COMP_origX+ 2 * COMP_WIDTH + HOR_GAP,COMP_origY + 8 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		chk_Evening.setBounds(COMP_origX+ 3 * COMP_WIDTH + HOR_GAP,COMP_origY + 8 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH,COMP_HEIGHT);
		
		txt_message.setBounds(COMP_origX +  COMP_WIDTH + HOR_GAP,COMP_origY + 9 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH * 2,COMP_HEIGHT * 4);
		
		btn_submit.setBounds(COMP_origX +  COMP_WIDTH + HOR_GAP,COMP_origY +  12 * (COMP_HEIGHT + VER_GAP),COMP_WIDTH ,COMP_HEIGHT + 10);
		
		add(txt_fname);add(txt_lname);add(txt_street);add(txt_city);add(txt_state);
		add(txt_country);add(txt_message);
		add(rd_male);add(rd_female);
		add(lst_courses);
		
		add(chk_Morning);add(chk_Afternoon);add(chk_Evening);
		
		add(lbl_header);
		add(lbl_fname);add(lbl_lname);add(lbl_street);add(lbl_city);add(lbl_state);
		add(lbl_country);add(lbl_message);add(lbl_gender);add(lbl_courses);add(lbl_session);
		add(btn_submit);
		
		
		ButtonEventHandler btnEvt = new ButtonEventHandler();		
		btn_submit.addActionListener(btnEvt);
		
	}
	
	class ButtonEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(txt_fname.getText().equals("") || txt_lname.getText().equals("") || txt_street.getText().equals("") || txt_country.getText().equals("") ||
					txt_message.equals(""))			
					JOptionPane.showMessageDialog(null,"field can not be empty","Error message",JOptionPane.INFORMATION_MESSAGE);
			else if((rd_male.isSelected() && rd_female.isSelected()) || (!rd_male.isSelected() && !rd_female.isSelected()))
				JOptionPane.showMessageDialog(null,"Select a gender ","Error message",JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"Successfully registered","Completion...",JOptionPane.INFORMATION_MESSAGE);
		
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MUMRegistration mumReg = new MUMRegistration();

	}

}
