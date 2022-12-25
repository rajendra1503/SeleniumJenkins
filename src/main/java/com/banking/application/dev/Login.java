package com.banking.application.dev;

public class Login {

	public static void main(String[] args) {
		
		String userName = "admin";
		String password = "admin@123";
		
		if (userName.equals("admin") && password.equals("admin@123")) {
			System.out.println("Valid Login credentials.");
		} else {
			System.out.println("Invalid Login credentials.");
		}

	}

}
