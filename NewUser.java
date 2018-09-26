import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prashanth
 */
public class NewUser extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Label fname = new Label("First Name : ");
        TextField fName = new TextField();
        Label lname = new Label("last Name : ");
        TextField lName = new TextField();
        Label uname = new Label("User Name : ");
        TextField uName = new TextField();
        Label dob = new Label("DOB : ");
        TextField Dob = new TextField();
        Dob.setPromptText("DD/MM/YYYY Format");
        Label pass = new Label("password : ");
        PasswordField Pass = new PasswordField(); 
        Label cpass = new Label("Confirm password : ");
        PasswordField cPass = new PasswordField(); 
        Label cques = new Label("Clue Question : ");
        TextArea cQues = new TextArea(); 
        cQues.setPrefHeight(50);
        cQues.setPrefWidth(200);
        cQues.setPromptText("please don't use $ or ' anywhere!");
        Label ans = new Label("Answer : ");
        TextField Ans = new TextField();
        Button reg = new Button("Register!");
        
        GridPane pane = new GridPane();
        pane.setHgap(20);
        pane.setVgap(20);
        pane.setConstraints(fname,3,1);
        pane.setConstraints(fName,4,1);
        pane.setConstraints(lname,3,2);
        pane.setConstraints(lName,4,2);
        pane.setConstraints(uname,3,3);
        pane.setConstraints(uName,4,3);
        pane.setConstraints(dob,3,4);
        pane.setConstraints(Dob,4,4);
        pane.setConstraints(pass,3,5);
        pane.setConstraints(Pass,4,5);
        pane.setConstraints(cpass,3,6);
        pane.setConstraints(cPass,4,6);
        pane.setConstraints(cques,3,7);
        pane.setConstraints(cQues,4,7);
        pane.setConstraints(ans,3,8);
        pane.setConstraints(Ans,4,8);
        pane.setConstraints(reg,4,9);
        pane.getChildren()
                .addAll(fname,fName,lname,lName,uname,uName,dob,Dob,pass,Pass,cpass,
                cPass,cques,cQues,ans,Ans,reg);
        
        Scene scene = new Scene(pane,500,500);        
        primaryStage.setTitle("New User?");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        reg.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                   try{
                    final int PORT_NUM = 10015;
                    Socket socket = new Socket ("localhost", PORT_NUM);
                    InputStream is = socket.getInputStream ();
                    OutputStream os = socket.getOutputStream ();
                    PrintWriter out = new PrintWriter (os);
                    Scanner in = new Scanner (is);
                    Scanner kbd = new Scanner (System.in);
                    String command = "", response = "";
                    if(!Pass.getText().trim().equals(cPass.getText().trim()));
                    {
                        Alert alert = new Alert(AlertType.WARNING);
                        alert.setTitle("Warning Dialog");
                        alert.setHeaderText("Oops!");
                        alert.setContentText("Mismatched passwords!");
                        alert.showAndWait();
                    }
                    while(true)
                    {
                       command = "Add";
                       command+= "$"+fName.getText().trim();
                       command+= "$"+lName.getText().trim();
                       command+= "$"+uName.getText().trim();
                       command+= "$"+Dob.getText().trim();
                       command+= "$"+Pass.getText().trim();
                       command+= "$"+cQues.getText().trim();
                       command+= "$"+Ans.getText().trim();
                       out.println(command);
                       out.flush();
                       if(in.hasNextLine())
                       {
                           response = in.nextLine();
                           System.out.println(response);
                           break;
                       }
                       
                       socket.close();
                       Alert alert = new Alert(AlertType.INFORMATION);
                       alert.setTitle("Congrats!");
                       alert.setHeaderText(null);
                       alert.setContentText("You have succesfully Registered!");
                       alert.showAndWait();
                       Home home = new Home();
                       home.start(primaryStage);
                    }
                   
                   } 
                   catch(Exception e){
                       e.printStackTrace();
                   }
            
            }
        });
    }
   
}
