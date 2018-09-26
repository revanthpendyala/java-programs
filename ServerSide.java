
import java.sql.Connection;
import java.sql.Statement;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prashanth
 */
public class ServerSide {
    
    public static void main (String Args[])
    {
        try
        {
            final int PORT_NUM = 10015;
            ServerSocket serverSocket = new ServerSocket (PORT_NUM);
            Socket socket;
            Thread thread;
            BackService service;
            while(true)
            {
               System.out.println("Waiting for clients to connect...");
	       socket = serverSocket.accept ();
               System.out.print ("Client connected...");
	       service = new BackService (socket);
	       thread = new Thread (service);
	       thread.start ();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
    
}

class BackService implements Runnable
{
    InputStream is;
    OutputStream os;
    PrintWriter out;
    Scanner in;
    Socket socket;
    String command = "", response = "";
    public BackService (Socket fromServer)
    {
	socket = fromServer;
			  
    }
    @Override
    public void run() {
        
        try
        {
            try
            {
                is = socket.getInputStream();
                os = socket.getOutputStream();
                out = new PrintWriter(os);
                in = new Scanner(is);
                if(in.hasNextLine())
                    command = in.nextLine();
                processCommand();
                
            }
            finally
            {
                socket.close();
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public void processCommand()
    {
        while (true)
	{
            if (command.equalsIgnoreCase ("quit"))
            {
		response = "Bye";
		out.print (response);
		out.flush ();
		response = "";
		command = "";
		return;
            }
            else
            {
                String pieces [] = command.split ("[$]+");
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    String us = "root" , pas = "Iamking1!";
                    Connection con = DriverManager
                            .getConnection("jdbc:mysql://localhost/java",us,pas);
                    Statement stmt = con.createStatement();
                    switch(pieces[0].charAt(0))
                    {
                        case 'A' : 
                        String updt = "Insert into users values ('";
                        for(int i=1;i<pieces.length-1;i++)
                        {
                            updt += pieces[i].trim()+"','" ;
                        }
                        updt += pieces[pieces.length-1]+"')";
                        System.out.println(updt);
                        stmt.executeUpdate(updt);
                        break;
                        
                        case 'C' : 
                        String query = "select pwd from users where uname='"+pieces[1].trim()+"'";
                        ResultSet rs = stmt.executeQuery(query);
                        if(rs.next())
                        {
                            if(rs.getString(1).equals(pieces[2].trim()));
                                response = "auth!";
                        }
                        break;
                    }
                    
                }
                catch(Exception e)
                    
                {
                    e.printStackTrace();
                }
                out.println (response);
                out.flush ();
                if (in.hasNextLine ())
                command = in.nextLine ();
            }
        }
        
    }
}
