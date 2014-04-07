/*
Author: Korben Carreno
Course: COP 3330-01
*/

import java.io.*;
import java.util.*;

public class Cipher {
	
	/****************************************************************
	 * Main Function
	 ****************************************************************/
	
	public static void main(String[] args) throws Exception {
		Scanner fin = new Scanner(new File("cipher.in"));
		System.out.println("Beginning to read the file!");
		int count = 0;
		
		
		while(fin.hasNext()){
			int key = 0;
			count++;
			String cipherText = "";
			String token = fin.nextLine();
			token = token.toUpperCase();//Error checking if file contains lower case characters.
			String[] stringArray = token.split(" ");
			
			/****************************************************************
			 * For loop prints entire string line from file.
			 ****************************************************************/
			for(int i = 0; i < token.length(); i++){
				key = Integer.parseInt(stringArray[0]);//The key is located at the 0 element in the array.
				key = key % 26;//Assign new key to shifted amount.
				/***************************************************************************
				 * Convert cast the char in the string at i element to int and assign value.
				 * Ascii values 65-90 include capital letters A-Z.
				 ***************************************************************************/
				int asciiValue = (int) token.charAt(i);
				if(asciiValue < 65 || asciiValue > 90){
					cipherText += token.charAt(i);
					continue;
				}
				
				/****************************************************************
				 * calculation of cipher text.
				 ****************************************************************/
				int basicValue = asciiValue - 65;
				int newAsciiValue = 65 + ((basicValue + key) % 26);
				cipherText += (char) newAsciiValue;
			}//End of for loop
			System.out.printf("Case #%d: %s\n", count, cipherText);
		}//End of while
		System.out.println("\nFinished reading the file!");
		fin.close();
	}//End of main

}//End of class
