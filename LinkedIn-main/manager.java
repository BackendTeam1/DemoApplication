package com.LinkedInApp;
//Role to send E-mail
public class manager extends chainelement {

	public manager(int level)
	{
		this.level = level;
	}

	protected void sendEmail(String message)
	{
		System.out.print("Email sent to DIRECTOR. Message: ");
		System.out.println(message);

	}

}


