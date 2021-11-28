package CredentialService;
import java.util.Random;

import Employee.Employee;

public class CredentialService {
	
	public String generateEmail(String FirstName,String LastName,String Department)
	{
		 return  FirstName+LastName+"@"+Department+".greatlearning.com";
    
	}
	
	public String generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";		
		String numbers="0123456789";
		String specialCharacters = "!@#$%^&*=/.?><";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i=0; i<8;i++) {
			password[i]= values.charAt(random.nextInt(values.length()));
		}
		//String str = new String();
		//str = password.toString();
		return String.valueOf(password);
		
	}
	
	 public void showCreds(Employee emp,String email , String password) {
		 
		 System.out.println("Hello"+emp.getFirstName()+":" + "\n your generated credentials listed below:");
		 System.out.println(email);
		 System.out.println(password);
	 }
}

