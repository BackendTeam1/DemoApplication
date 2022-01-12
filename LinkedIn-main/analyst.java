package com.LinkedInApp;

// Role to send E-mail
public class analyst extends chainelement{
	
	public analyst(int level)
	{
		this.level = level;
	}

	
	protected void sendEmail(String message) {
		System.out.print("Email sent to MANAGER. Message: ");
		System.out.println(message);
		
	}
	
}
