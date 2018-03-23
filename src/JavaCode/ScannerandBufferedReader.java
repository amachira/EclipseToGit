package JavaCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerandBufferedReader {
	// Code using Scanner Class
	     public static void main(String args[]) throws NumberFormatException, IOException
	     {
	         Scanner scn = new Scanner(System.in);
	         System.out.println("Enter an integer");
	         int a = scn.nextInt();
//	         String b = scn.nextLine();
	         System.out.println("Enter a String");
	        
	         String c = scn.nextLine();
	         System.out.println("You have entered:- 	  + "    + a + " " + "and name as " +c);
	    
	     
	         BufferedReader br = new BufferedReader(new
	        	        InputStreamReader(System.in));
	        	        System.out.println("Enter an integer");
	        	        int ab = Integer.parseInt(br.readLine());
	        	        System.out.println("Enter a String");
	        	        String bb = br.readLine();
	        	        System.out.printf("You have entered:- " + ab +
	        	                          " and name as " + bb);
	        	    }
	     
	     }
	

