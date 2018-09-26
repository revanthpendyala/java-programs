//reading passwords and usernames
import java.io.Console;
public class ReadingPassword
    {
     public static void main(String [] args)
       		{
				Console reader = System.console();
				String username = reader.readLine(" UserName :");
				char[] password ,passwordCopy;
				do {
				password = reader.readPassword (" Password:");
			    passwordCopy = reader.readPassword(" confirm password:");
			       }
				while(!(new String (password)). equals (new String (passwordCopy)));
			    System.out.println(username + " " + new String password);



			}
    }