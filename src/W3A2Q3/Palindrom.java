package W3A2Q3;

import java.util.Stack;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> str_left_to_right = new Stack<Character>();
		Stack<Character> str_right_to_left = new Stack<Character>();
		String input = "";
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Enter string to be checked  : ");
			input = in.nextLine();
			for (int i = 0, j = input.length() - 1; i < input.length(); i++, j--) {
				str_left_to_right.push(input.charAt(i));
				str_right_to_left.push(input.charAt(j));
			}
			boolean palindrom = true;
			for (int i = 0; i < str_left_to_right.size(); i++) {
				if (str_left_to_right.get(i) != str_right_to_left.get(i)) {
					palindrom = false;
					break;
				}
			}
			System.out.println("The string " + input + " is palindrom --> "
					+ palindrom);
			str_left_to_right.clear();
			str_right_to_left.clear();
		} while (true);
		
		

	}

}
