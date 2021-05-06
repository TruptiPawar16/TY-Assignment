package net.codejava;

import java.util.Scanner;

public class UncoupledNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the number");
        String[] str = scanner.nextLine().split(",");
        int result = 0;
        for(String i : str)
            result ^= Integer.parseInt(i.trim());
        System.out.println(result);
	}

}
