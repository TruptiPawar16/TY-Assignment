package net.codejava;

import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{  
			String s;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter a String: ");  
			s=sc.nextLine();                    //reading string from user  
			System.out.print("Reverse string is: ");  
			for(int i=s.length();i>0;--i)                //i is the length of the string  
			{  
			System.out.print(s.charAt(i-1));            //printing the character at index i-1  
			}  
		}  
		
		
	}

}
