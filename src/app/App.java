package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		MyStack bStack = new MyStack(10);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the expression you want to check:");
		String string = scanner.nextLine();

		boolean check = true;

		for (int i = 0; i < string.length(); i++){
			String item = String.valueOf(string.charAt(i));
			if (item.equals("(")){
				if (i < string.length()-1){
					String itemNext = String.valueOf(string.charAt(i+1));
					if (itemNext.equals(")")){
						check = false;
						break;
					}
				}
				bStack.push("(");
			}else if(item.equals(")")) {
				String getStack = bStack.pop();
				if (getStack == null){
					check = false;
					break;
				}
			}
		}

		if (check && bStack.size() == 0){
			System.out.println("Correct expression.");
		}else{
			System.out.println("Wrong expression.");
		}
	}
}
