
public class Main 
{
	public static void main(String[] Args)
	{	
		//This is to get the initial password
		User_Extended user = new User_Extended();
		System.out.println();
		
		//This is to simulate if user gives correct email as well as correct code 
		System.out.println();
		ResetPasswordProxy rpp1 = new ResetPasswordProxy(user);
		rpp1.resetPassword(user);
	
		//This is to simulate if email is correct but code is wrong 
		System.out.println();
		ResetPasswordProxy rpp2 = new ResetPasswordProxy(user);
		rpp2.resetPassword(user);
	
		//This is to simulate if the user gives wrong email only 
		System.out.println();
		ResetPasswordProxy rpp3 = new ResetPasswordProxy(user);
		rpp3.resetPassword(user);
	}
}