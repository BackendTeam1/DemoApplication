import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResetPasswordImplementation implements ResetPassword
{
	
	String email;
	String code;
	String inputcode;
	
	public ResetPasswordImplementation(User_Extended user)
	{
		code  = user.code;
	}

	public boolean verifyCode()
	{
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Code: ");
			inputcode = br.readLine();
		
			if(code.equals(inputcode) )
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	//Implementing reset password function after veryfing the email of user 
	@Override
	public void resetPassword(User_Extended user) 
	{			
		boolean isCode =verifyCode();

		if(isCode)
		{
			try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new password: ");
			String newpassword = br.readLine();
			user.setPassword(newpassword);
			System.out.println("The new updated password is: "+newpassword);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else
			
		{
		
			System.out.println("Invalid Unique Code, Password remains unchanged ");
		}
	}
}
