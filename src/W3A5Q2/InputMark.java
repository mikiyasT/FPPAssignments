package W3A5Q2;

import javax.swing.JOptionPane;

public class InputMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputMark("[please input the mark]");

	}

	private static void inputMark(String promt) {
		String inputString;
		do {
			inputString = JOptionPane.showInputDialog(null, promt);
			try {
				int mark = Integer.parseInt(inputString);
				if (mark < 0 || mark > 100)
					throw new Exception();
				System.out.println("input mark is " + mark);

			} catch (NumberFormatException ex) {
				JOptionPane
						.showMessageDialog(null, "Please enter only numbers");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						"Only posetive numbers [0, 100] are allowed");
			}
		} while (true);
		
	}

}
