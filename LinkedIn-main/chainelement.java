package com.LinkedInApp;

/*
 * Chaining of elements Analyst -> Manager -> Director and their levels.
 */
public abstract class chainelement {
	
	protected int level;
	protected chainelement nextchainele; //next element in the chain of responsibility
	
	public void setNextchainElement(chainelement nextchainele)
	{
		this.nextchainele = nextchainele;
	}
	
	public void trysendemail(int level, String message)
	{
		if(this.level >=level)
		{
			sendEmail(message);
		}
		if(nextchainele != null)
			nextchainele.trysendemail(level, message);
	}
	
	abstract protected void sendEmail(String message);

}
