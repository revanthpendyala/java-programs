import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prashanth
 */
public class login extends Application {

    @Override
    public void start(Stage primaryStage){
        
        Label uname = new Label();
        Button lg = new Button("log out");
        
        GridPane pane = new GridPane();
        pane.setConstraints(uname,4,1);
        pane.setConstraints(lg,4,3);
        pane.getChildren().addAll(uname,lg);
        
        Scene scene = new Scene(pane,650,150);        
        primaryStage.setTitle("Logged In");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
