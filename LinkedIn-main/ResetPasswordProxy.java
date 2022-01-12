import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ResetPasswordProxy implements ResetPassword 
{
	 boolean ifUser;
	 ResetPasswordImplementation rstPwImplementer ;
	 String inputemail;
	 String email;
	  
	 
	  public ResetPasswordProxy(User_Extended user) 
	  {	 
		  email = user.getEmail();
	  }
	  
	//Proxy function it will call real function if the user is verified
	  
	  //This code will verify whether the user is correct or other person 
	  public void verified(User user)
	  {
		  try 
	  		{
			  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  email = user.getEmail();
			  System.out.println("Enter the user Email: ");
			  inputemail = br.readLine();
			  if(email.equals(inputemail)) 
			  {
				  ifUser = true;
			  }	
	  		}
		  catch(Exception e)
		  {
		  e.printStackTrace();
		  }
	  }
	  
	  public void resetPassword(User_Extended user)
	{
		// TODO Auto-generated method stub
		 
		 verified(user);
		  
		 if(ifUser)
		 {
			 rstPwImplementer = new ResetPasswordImplementation(user);
			 rstPwImplementer.resetPassword(user); 
		 }
		 else
			 System.out.println("Incorrect Email Address, Password remains unchanged ");
	}
}
