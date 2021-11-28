package Main;

import Employee.Employee;
import java.util.Scanner;
import CredentialService.CredentialService;

public class Driver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Name");
		String FirstName = sc.next();
		System.out.println("Enter last Name");
		String LastName = sc.next();
		System.out.println("Enter Department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Leagal");
		System.out.println("Enter choice");
		   int choice= sc.nextInt();
		   String email=null;
		  String password = null;
		   CredentialService credentialService = new CredentialService ();
		   
		   if (choice==1) {
			   Employee emp = new Employee(FirstName, LastName,"Technical");
			   email = credentialService.generateEmail(FirstName, LastName,"Technical");
			   password = credentialService.generatePassword();
			   System.out.println("email is ::" + email);
			   System.out.println("password is ::" + password);
			   
			   credentialService.showCreds( emp, email , password);
			   
			   
		   }else if (choice==2) {
			   Employee emp = new Employee(FirstName, LastName,"Admin") ;
			   email = credentialService.generateEmail(FirstName, LastName,"Admin") ;
			   password = credentialService.generatePassword();
			   System.out.println("email is ::" + email);
			   System.out.println("password is ::" + password);
			   credentialService.showCreds( emp, email , password);
			   
		   }else if (choice==3) {
			   Employee emp = new Employee(FirstName, LastName,"Human Resource");
			   email = credentialService.generateEmail(FirstName, LastName,"Admin") ;
			   password = credentialService.generatePassword();
			   System.out.println("email is ::" + email);
			   System.out.println("password is ::" + password);
			   credentialService.showCreds( emp, email , password);
			   
		   }else if (choice==4) {
			   Employee emp = new Employee(FirstName, LastName,"Legal");
			   email = credentialService.generateEmail(FirstName, LastName,"Legal");
			   password = credentialService.generatePassword();
			   System.out.println("email is ::" + email);
			   System.out.println("password is ::" + password);
			   credentialService.showCreds( emp, email , password);
			   
		   }else  {
			   System.out.println("Enter valid input");
		}
		
		
	
	}

}
