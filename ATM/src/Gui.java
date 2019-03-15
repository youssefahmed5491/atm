import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Gui  {
	
	private Stage stage;
	private Scene scene;
	private user myuser;
	private homescreen myhomescreen;
	
	public Gui(Stage stage) {
		this.stage =stage;
	}
		
	public void prepareScene() {
		
		myuser=new user();
		
		Label cardnumberLable = new Label( "Card Number");
		cardnumberLable.setFont(new Font("Verdana", 18));
		PasswordField cardnumberField = new  PasswordField();
		Button submit = new Button ( "Submit");
		submit.setFont(new Font("Verdana", 14));
		Label validation = new Label();
		
		GridPane grid = new GridPane ();
		grid.add( cardnumberLable, 0, 0);
		grid.add( cardnumberField, 1, 0);
		grid.add( submit , 1, 1);
		grid.add( validation,1,2);
		grid.setStyle("-fx-base: lightgreen");
		submit.setStyle("-fx-base: orange");
		
		submit.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				String cardnumber = cardnumberField.getText();
				myuser.settingcardnumber(cardnumber); 
				boolean valid =  myuser.validate();
				if(valid) {
					stage.setScene(homescreen.getScene());
				}
				else {
					validation.setText("wrong card number"); 
					validation.setFont(new Font("Verdana", 20));
				}	
			}
		}) ;
		scene = new Scene(grid , 500 , 400 );
	}
	public Scene getScene() {
		return this.scene;
	}
	public void setmyhomescreen(homescreen myhomescreen) {
		this.myhomescreen = myhomescreen;
	}
	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public user getMyuser() {
		return myuser;
	}

	public void setMyuser(user myuser) {
		this.myuser = myuser;
	}

	public homescreen getMyhomescreen() {
		return myhomescreen;
	}

	public void setMyhomescreen(homescreen myhomescreen) {
		this.myhomescreen = myhomescreen;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
}