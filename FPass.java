/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *
 * @author prashanth
 */

public class FPass extends Application {

    @Override
    public void start(Stage primaryStage) {
            
                
        Label fname = new Label("First Name : ");
        TextField fName = new TextField();
        Label lname = new Label("last Name : ");
        TextField lName = new TextField();
        Label dob = new Label("DOB : ");
        TextField Dob = new TextField();
        Dob.setPromptText("DD/MM/YYYY Format");
        Label cques = new Label("Clue Question : ");
        TextArea cQues = new TextArea(); 
        cQues.setPrefHeight(50);
        cQues.setPrefWidth(200);
        Label ans = new Label("Answer : ");
        TextField Ans = new TextField();
        Button show = new Button("Show details!");
        
        GridPane pane = new GridPane();
        pane.setHgap(20);
        pane.setVgap(20);
        pane.setConstraints(fname,3,1);
        pane.setConstraints(fName,4,1);
        pane.setConstraints(lname,3,2);
        pane.setConstraints(lName,4,2);
        pane.setConstraints(dob,3,3);
        pane.setConstraints(Dob,4,3);
        pane.setConstraints(cques,3,4);
        pane.setConstraints(cQues,4,4);
        pane.setConstraints(ans,3,5);
        pane.setConstraints(Ans,4,5);
        pane.setConstraints(show,4,6);
        pane.getChildren()
                .addAll(fname,fName,lname,lName,dob,Dob,cques,cQues,ans,Ans,show);
        
        Scene scene = new Scene(pane,500,400);        
        primaryStage.setTitle("Forgot Pass/user");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
}
