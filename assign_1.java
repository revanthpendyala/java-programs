import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class assign_1 extends Application
{
  public void start(Stage mystage)
  {
    TextField tf = new TextField();
     Label lb = new Label("Username :");
     Label lb_1 = new Label("Password :");
    PasswordField pf = new PasswordField();

    Button bn1 = new Button("New User?");
    Button bn2 = new Button("Login");
    Button bn3 = new Button("Forgot Username/password?");

    GridPane pn = new GridPane();
    pn.setHgap(20);
    pn.setVgap(20);
    pn.setConstraints(lb,4,1);
    pn.setConstraints(tf,5,1);
    pn.setConstraints(lb_1,4,2);
    pn.setConstraints(pf,5,2);
    pn.setConstraints(bn1,2,3);
    pn.setConstraints(bn2,5,3);
    pn.setConstraints(bn3,7,3);

    pn.getChildren().addAll(tf,lb,lb_1,pf,bn1,bn2,bn3);

   Scene sn = new Scene(pn,650,300);

   mystage.setScene(sn);
   mystage.setTitle("USER END");

   //REGISTRATION WINDOW

   Stage st_1 = new Stage();

   GridPane gp1 = new GridPane();

   Label l1 = new  Label("First Name:");
   TextField tf1 = new TextField();
   Label l6 = new  Label("Last Name:");
   TextField tf4 = new TextField();
   Label l7 = new  Label("Date of Birth:");
   TextField tf5 = new TextField();
   Label l2 = new Label("Password:");
   TextField tf2 = new TextField();
   Label l3 = new Label("Confirm Password:");
   PasswordField p1 = new PasswordField();

   Label l4 = new Label("Clue Question:");
   TextArea ta = new TextArea();
   ta.setPrefHeight(50);
   ta.setPrefWidth(200);
   Label l5 = new Label("Answer:");
   TextField tf3 = new TextField();
   Button b2 = new Button("Register");

   gp1.setHgap(20);
    gp1.setVgap(20);
    gp1.setConstraints(l1,3,1);
    gp1.setConstraints(tf1,4,1);
    gp1.setConstraints(l6,3,2);
    gp1.setConstraints(tf4,4,2);
    gp1.setConstraints(l7,3,3);
    gp1.setConstraints(tf5,4,3);
    gp1.setConstraints(l2,3,4);
    gp1.setConstraints(tf2,4,4);
    gp1.setConstraints(l3,3,5);
    gp1.setConstraints(p1,4,5);
    gp1.setConstraints(l4,3,6);
    gp1.setConstraints(ta,4,6);
    gp1.setConstraints(l5,3,7);
    gp1.setConstraints(tf3,4,7);
    gp1.setConstraints(b2,4,8);

   gp1.getChildren().addAll(l1,tf1,l2,tf2,l3,p1,l4,ta,l5,tf3,b2,l6,l7,tf5,tf4);

   Scene sn2 = new  Scene(gp1,500,400);

   st_1.setTitle("REGISTER");
   st_1.setScene(sn2);

  //FORGOT UNAME PWORD

  Stage st_2 = new Stage();

  GridPane gp_2 = new GridPane();

   Label lb1 = new  Label("First Name :");
   TextField t1 = new TextField();
   Label lb2 = new  Label("Last Name :");
   TextField t2 = new TextField();
   Label lb3 = new  Label("Date of Birth :");
   TextField t3 = new TextField();
   Label lb4 = new Label("Clue Question :");
   TextArea t_1 = new TextArea();
   t_1.setPrefHeight(50);
   t_1.setPrefWidth(200);
   Label lb5 = new Label("Answer :");
   TextField t4 = new TextField();
   Button b_2 = new Button("Submit");

    gp_2.setHgap(20);
    gp_2.setVgap(20);
   gp_2.add(lb1,3,1);
   gp_2.add(t1,4,1);
   gp_2.add(lb2,3,2);
   gp_2.add(t2,4,2);
   gp_2.add(lb3,3,3);
   gp_2.add(t3,4,3);
   gp_2.add(lb4,3,4);
   gp_2.add(t_1,4,4);
   gp_2.add(lb5,3,5);
   gp_2.add(t4,4,5);
   gp_2.add(b_2,4,6);

   //gp_2.addAll(lb1,t1,lb2,t2,lb3,t3,lb4,t4,t_1,lb5,t4,b_2);

  Scene sn3 = new Scene(gp_2,400,400);

  st_2.setScene(sn3);
  st_2.setTitle("FORGOT USERNAME/PASSWORD");

   mystage.show();

  bn1.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent ae){
       st_1.show();
    }
   });

   bn3.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent ae){
       st_2.show();
    }
   });
  }
 }