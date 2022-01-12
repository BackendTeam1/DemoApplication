
public class User_Extended  extends User
{
	char[] alpha = new char[30];
	protected String code;
	
	//In case a user doesn't exist call the giveAccountDetails from user class	
	public User_Extended()
	{
		if(userEmail==null || pass == null || code == null)
		{
			giveAccountDetails();
			code = randomCode();
			setCode(code);
		}
	}
	
		//Part of random code generator ALgorithm
		public void fillArray()
		{
			for(int i = 65; i<=90; i++)
			{
				alpha[i - 65] = (char)i;
			}
		}
		
		public String randomCode()
		{		fillArray();
				System.out.println("Dear User, Here your 10-digit unique code, so "
				+ "please don't share with anyone: ");
		String randomcode = Integer.toString((int)(Math.random() *10)) + alpha[(int)(Math.random() * 10)] + 
			Integer.toString((int)(Math.random() *10)) +  alpha[(int)(Math.random() *10)] + 
			Integer.toString((int)(Math.random() *10)) +  alpha[(int)(Math.random() *10)] + 
			Integer.toString((int)(Math.random() *10)) +  alpha[(int)(Math.random() *10)] + 
			Integer.toString((int)(Math.random() *10)) +  alpha[(int)(Math.random() *10)];
		System.out.println(randomcode);
		return randomcode;
		}

		//Changing the password
		@Override
		public void setPassword(String password)
		{
			pass = password;
		}
		
		//Retrieving the passwords
		@Override
		public String getPassword() 
		{
			return pass;
		}
}
