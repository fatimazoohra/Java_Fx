package application;
	


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Circle c = new Circle(200,200,100);	
			c.setFill(Color.RED);
			root.getChildren().add(c);
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("first fx");
			primaryStage.setScene(scene);
			primaryStage.show();
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
