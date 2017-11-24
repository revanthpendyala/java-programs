import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
public class GrowAndShrinkCircleV2 extends Application
      {
		 double radius = 100;
		 Circle circle = new Circle ();
         public void start (Stage primaryStage)
             {
				 primaryStage.setTitle ("Growing and Shrinking Circle");
				 StackPane stackPane = new StackPane ();
				 circle.setRadius (radius);
				 circle.setFill (new Color (0.75, 0, 0, 0.5));
				 circle.setStroke (new Color (0.0, 0.25, 0.0, 0.5));
				 circle.setStrokeWidth (4);
				 stackPane.getChildren ().add (circle);
				 HBox hBox = new HBox ();
				 hBox.setSpacing (20);
				 hBox.setAlignment (Pos.CENTER);
				 Button shrink = new Button ("Shrink");
				 shrink.setOnAction (new ShrinkHandler ());
				 Button grow = new Button ("Grow");
				 grow.setOnAction (new GrowHandler ());
				 hBox.getChildren ().addAll (shrink, grow);
				 BorderPane borderPane = new BorderPane ();
				 borderPane.setCenter (stackPane);
				 borderPane.setBottom (hBox);
                 borderPane.setAlignment (hBox, Pos.CENTER);
                 borderPane.setPadding (new Insets (20, 20,  20, 20));
				 Scene scene = new Scene (borderPane, 600, 600);
				 primaryStage.setScene (scene);
				 primaryStage.show ();
             }
             class ShrinkHandler implements EventHandler<ActionEvent>
                  {
					  public void handle (ActionEvent ae)
					     {
							 if (radius > 50)
							   radius -= 2;
							 circle.setRadius (radius);
						 }
				  }
             class GrowHandler implements EventHandler<ActionEvent>
                  {
					  public void handle (ActionEvent ae)
					     {
							 if (radius < 200)
							   radius += 2;
							 circle.setRadius (radius);
						 }
				  }

      }

