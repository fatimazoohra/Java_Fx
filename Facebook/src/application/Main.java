package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	public void start(Stage primaryStage){
		BorderPane root = new BorderPane() ;
		Scene scene = new Scene(root,300,300,Color.BLUE);
		
		MenuBar menuBar = new MenuBar();
		
		Menu menu = new Menu("imprimer");
		Menu menu = new Menu("imprimer");
		Menu menu = new Menu("imprimer");
		Menu menu = new Menu("imprimer");
		
		
		
		
	
		//grid.setGridLinesVisible(false);
		
		Button envoyer = new Button("Envoyer");
		HBox hbenvoyer = new HBox(10);
		hbenvoyer.setAlignment(Pos.BOTTOM_LEFT);
		//hbenvoyer.getChildren().add(envoyer);
		grid.add(hbenvoyer,1,4);
		
		Button effacer = new Button("Effacer");
		hbenvoyer.getChildren().addAll(envoyer,effacer);
		
		final Text actiontarget = new Text();
		grid.add(actiontarget,1,3);
		
		envoyer.setOnAction(event ->{
			actiontarget.setFill(Color.FIREBRICK);
			actiontarget.setText(userTF.getText()+" merci pour votre interaction");
		});
		
		effacer.setOnAction(event ->{
			actiontarget.setFill(Color.FIREBRICK);
			userTF.setText("");
			actiontarget.setText("");
		});
		
		primaryStage.setTitle("JavaFx Interaction Form");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
