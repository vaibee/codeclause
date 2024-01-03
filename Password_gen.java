package codeclause_intern_pass_gen;

import java.util.Random;
import java.util.Scanner;

public class Password_gen {
	public static String GeneratePas(int length) {
		String letters = "/@01234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVXYZ,./#@";
		Random Ramd_Pas = new Random();
		char[]  Pass = new char [length];
		for(int i=0;i<length;i++) {
			Pass[i]= letters.charAt(Ramd_Pas.nextInt(letters.length()));
		}
		return new String(Pass);
	}
	public static void main(String[] args) {
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Password you prefer: ");
		length = sc.nextInt();
		
				
		String pass = GeneratePas(length);
		System.out.print("Your password is :" + pass);
		
	}

}
