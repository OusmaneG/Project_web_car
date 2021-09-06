package com.saraya.login;

	public class UserValidation {
		boolean isValid(String usr, String passw) {
	
		if (usr.equalsIgnoreCase("ousmane") && passw.equals("123")) {
				return true ; }
			else {
				return false ;
			}
		}
	}
	

