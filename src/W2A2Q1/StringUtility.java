package W2A2Q1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class StringUtility extends JFrame{
	
	private JTextField txt_input;
	private JTextField txt_output;
	private JButton btn_count;
	private JButton btn_revers;
	private JButton btn_remove;
	private JLabel lbl_input;
	private JLabel lbl_output;//ouput
	
	
	StringUtility(){
		setTitle("String Utility");
		setVisible(true);
		setSize(400,300);
		//setResizable(false);
		setLayout(null);
	
		
		txt_input = new JTextField();
		txt_output = new JTextField();
		
		btn_count = new JButton("Count Letters");
		btn_revers = new JButton("Rverse Letters");
		btn_remove = new JButton("Remove Duplicates");
		lbl_input = new JLabel("input");
		lbl_output = new JLabel("output");
		
		btn_count.setBounds(10, 10, 150,20);
		btn_revers.setBounds(10, 40, 150,20);
		btn_remove.setBounds(10, 70, 150,20);
		
		
		txt_input.setBounds(170, 30, 150,20);
		txt_output.setBounds(170, 70, 150,20);
		
		lbl_input.setBounds(170, 10, 150,20);
		lbl_output.setBounds(170, 50, 150,20);
		
		
		add(lbl_input);
		add(lbl_output);
		add(btn_count);
		add(btn_revers);
		add(btn_remove);
		add(txt_input);
		add(txt_output);
		
		
		
		ButtonEventHandler btnEvt = new ButtonEventHandler();
		btn_count.addActionListener(btnEvt);
		btn_revers.addActionListener(btnEvt);
		btn_remove.addActionListener(btnEvt);
	}
	
	class ButtonEventHandler implements ActionListener{

		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource() == btn_count){
				if(txt_input.getText() != null)
					txt_output.setText(Integer.toString(txt_input.getText().length()));
			}else if(event.getSource() == btn_revers){
				if(txt_input.getText() != null){
					String rev = "";
					for(int i = txt_input.getText().length() - 1; i >= 0; i--)
						rev += txt_input.getText().charAt(i);
					txt_output.setText(rev);	
					
				}
				
			}else if(event.getSource() == btn_remove){
				String noDup = "";
				for(int i = 0; i < txt_input.getText().length(); i++){
					if(!noDup.contains("" + txt_input.getText().charAt(i)))
					noDup += txt_input.getText().charAt(i);					
				}
				txt_output.setText(noDup);	
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringUtility strUtil = new StringUtility();

	}

}
