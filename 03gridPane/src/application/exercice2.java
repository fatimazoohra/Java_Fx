package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class exercice2 extends Application{

	public void start(Stage primaryStage){
		BorderPane pane =new BorderPane();
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		pane.setPadding(new Insets(10, 20, 10, 20));
		Scene scene =new Scene(pane,350,200);
		Text title = new Text("Jours");
		title.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
		
		final Text text = new Text();
		final Text text2 = new Text();
		
		ListView<String> lvJours = null;
		ObservableList<String> jours = 
				FXCollections.observableArrayList("lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche");
		lvJours = new ListView<String>(jours);
		lvJours.setPrefSize(200, 150);
		
		MultipleSelectionModel<String> lvSelModel = lvJours.getSelectionModel();
		lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> selected, String oldVal, String newVal)
			{
				text.setText("previously you have choosed: "+ oldVal);
				text2.setText("and now, you choose: "+ newVal);
				
			}
		});
		
		
		pane.setTop(title);
		pane.setCenter(lvJours);
		pane.setBottom(grid);
		grid.add(text,1,1);
		grid.add(text2,1,2);
		
		
		primaryStage.setTitle("JavaFx Interaction Form");
		primaryStage.setScene(scene);
		primaryStage.show();	
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
