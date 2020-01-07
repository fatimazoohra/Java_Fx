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

public class Login extends Application {
	public void start(Stage primaryStage) {
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		Scene scene =new Scene(grid,360,200);
		Text titre = new Text("votre nom et votre mot de passe");
		titre.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
		Label userLbl=new Label("Nom d'utilisateur");
		TextField userTF = new TextField();
		Label pwLbl=new Label("Mot de passe : ");
		PasswordField pwTF= new PasswordField();
		//Button btn = new Button("OK");
		grid.add(titre, 0, 0,2,1);
		grid.add(userLbl, 0, 1);
		grid.add(userTF, 1, 1);
		grid.add(pwLbl, 0, 2);
		grid.add(pwTF, 1, 2);
		
		grid.setGridLinesVisible(false);
		
		Button btn1 = new Button("sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn1);
		grid.add(hbBtn,1,4);
		
		final Text actiontarget = new Text();
		grid.add(actiontarget,1,6);
		
		btn1.setOnAction(event ->{
			actiontarget.setFill(Color.FIREBRICK);
			actiontarget.setText("Sign In button pressed");
		});
		
		primaryStage.setTitle("JavaFx Login Form");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
