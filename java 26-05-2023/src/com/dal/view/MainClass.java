package com.dal.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.dal.controller.EmployeeController;
import com.dal.controller.EmployeeInterface;
import com.dal.exception.UserNotFoundException;


public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to EMS :)");
		EmployeeController ec = new EmployeeController();
		Scanner sc = new Scanner(System.in);
		String ch = null;
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Username");
			String username = br.readLine();
			System.out.println("Enter password");
			String password = br.readLine();
			
			if(username.equals("Rithick")  && password.equals("password")) {
				try {
					System.out.println("please wait loggin you in.....");
					Thread.sleep(4000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Serialize");
			System.out.println("4. Deserialze");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				ec.addEmployee();
				break;
			}

			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.Serialize();
				break;
			}
			case 4: {
				ec.DeSerialize();
				break;
			}

			default: {
				System.out.println("Enter a valid number");
				break;
			}
			}

			System.out.println("Do u want to continue Y | y");
			ch = sc.next();

		} while (ch.equals("Y") || ch.equals("y"));
		System.out.println("Thanks for using our system.");
		System.exit(0);
			
	}else {
		System.out.println("sorry wrong login");
		throw new UserNotFoundException();
		
	}
			

}	catch(UserNotFoundException | IOException une) {
	System.out.println(une);

}
	}}