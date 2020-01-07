package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class exercice1 extends Application{

		public void start(Stage primaryStage){
			GridPane grid=new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setVgap(10);
			grid.setHgap(10);
			Scene scene =new Scene(grid,360,200);
			Text titre = new Text("Lissez un message");
			titre.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
			Label userLbl=new Label("Votre nom");
			TextField userTF = new TextField();
			Label pwLbl=new Label("Votre message ");
			TextField msTF= new TextField();
			grid.add(titre, 0, 0,2,1);
			grid.add(userLbl, 0, 1);
			grid.add(userTF, 1, 1);
			grid.add(pwLbl, 0, 2);
			grid.add(msTF, 1, 2);
			
			grid.setGridLinesVisible(false);
			
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
