package com.pcsetting.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ii {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a number");
        String str1 = br1.readLine();
        int num = Integer.parseInt(str1);
        System.out.println("The number you entered is : " + num);
        
        System.out.println("Please enter a string : ");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        
        String str2 = br2.readLine();
        System.out.println("The string you just entered is : " + str2);
	}

}

