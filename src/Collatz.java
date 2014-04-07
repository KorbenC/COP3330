/*
Author: Korben Carreno
Course: COP 3330-01
*/

import java.util.*;
import java.io.*;

public class Collatz{
	
	/****************************************************************
	 * Main Function(method)
	 ****************************************************************/
	
	public static void main(String[] args) throws Exception{
		Scanner fin = new Scanner(new File("collatz.in"));
		System.out.println("Beginning to read the file!");
		int steps = 0;
		int count = 0;
		
		while(fin.hasNext()){
			count++;
			int token = fin.nextInt();
			int max = 0;
			
			System.out.printf("\nCollatz Sequence #%d: %d ", count, token);
			
			while(token != 1){//loops until token has hit 1.
	
			/****************************************************************
			 * Calculate Max, and Collatz Conjecture
			 ****************************************************************/
				if(token > max){
					max = token;
				}
				if(token % 2 == 0){
					token = token / 2;
				}
				else{
					token = (token * 3) + 1;
				}
				
			System.out.printf("%d ", token);
			steps++;//increments number of loops passed.
			}//End of while
			
			
			System.out.printf("\nNumber of step(s) taken: %d", steps);
			System.out.printf("\nLargest number in sequence: %d\n", max);
			
			
			steps = 0;//resets variable for next sequence.
		}//End of while
		System.out.println("\nFinished reading the file!");
		fin.close();
	}//End of main
}//End of class