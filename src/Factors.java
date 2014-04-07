/*
Author: Korben Carreno
Course: COP 3330-01
*/

import java.util.*;
import java.io.*;


public class Factors {

	/***************************************************************
	* Main Function(method)
	****************************************************************/
	
	public static void main(String[] args)throws Exception {
		Scanner fin = new Scanner(new File("factors.in"));
		System.out.println("Beginning to read the file!");
		int count = 0;
		
		while(fin.hasNext()){
			
			count++;
			int token = fin.nextInt();
			isFactor(count, token);


		}
		System.out.println("\nFinished reading the file!");
		fin.close();

	}//End of main
	/****************************************************************
	 * Method that returns the factors.
	 ****************************************************************/	
	public static void isFactor(int count, int token) {
		//If statement logically determines the factors. 1, itself, and not divisible by even. 
		if(token < 2 || (token != 2 && token % 2 == 0)){
			System.out.printf("\nCase number #%d: %d has factor(s): ", count, token);
			for(int i = 1; i <= token; i++){
				if(token % i == 0){
					System.out.printf(" %d", i);
				}
			}
		}
		
		else{
			if(isPrime(token)){//if true
				System.out.printf("\nCase number #%d: %d is a prime.",count, token);
			}
			else{
				System.out.printf("\nCase number #%d: %d is not a prime!",count, token);
			}
		}
	}
	/****************************************************************
	 * Boolean performs quality check if prime.
	 ****************************************************************/
	public static boolean isPrime(int token){
		boolean isPrime = true;
		for(int check = 3; check < token; check += 2){
			if(token % check == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
		
	}

}//End of class
