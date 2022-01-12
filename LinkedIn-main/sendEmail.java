package com.LinkedInApp;
/*
 * Sending email
 */
public class sendEmail {

	private String role;

	sendEmail(String role)
	{
		this.role = role;

	}

	public void print()
	{
		chainelement elementOne = new analyst(2);
		chainelement elementTwo = new manager(1);
		chainelement elementThree = new director(0);

		elementOne.setNextchainElement(elementTwo);
		elementTwo.setNextchainElement(elementThree);

		if(role.equalsIgnoreCase("analyst"))
		{
			elementOne.trysendemail(0, "Analyst account created.");
			System.out.println("- - - - - - - - - -");
		}

		else if(role.equalsIgnoreCase("manager"))
		{
			elementTwo.trysendemail(0, "Manager account created.");
			System.out.println("- - - - - - - - - -");
		}

		else if(role.equalsIgnoreCase("director"))
		{
			elementThree.trysendemail(2, "Director account created.");
			System.out.println("- - - - - - - - - -");
		}
		else System.out.println("Role should be Analyst, manager OR director.");
	}
}
	
		/*
		 * HIGH - 0 - Email to all three
		 * MEDIUM - 1 - Email to Analyst & Manager
		 * LOW - 2 - Email to Analyst only
		 */
		
