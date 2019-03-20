import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {
	public static void main (String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage ) throws Exception {
		primaryStage.setTitle("ATM"); 
		
		Gui gui = new Gui(primaryStage);
		homescreen myhomescreen = new homescreen(primaryStage);
		wthd mywd = new wthd(primaryStage);
		dep mydep = new dep(primaryStage);
		
		gui.prepareScene();
		homescreen.prepareScene();
		wthd.prepareScene();
		dep.prepareScene();
		
		gui.setmyhomescreen(myhomescreen);
		myhomescreen.setwithdrawl(mywd);
		myhomescreen.setdeposit(mydep);
		mywd.setmyhomescreen(myhomescreen);
		mydep.setmyhomescreen(myhomescreen);
		
		primaryStage.setScene(gui.getScene());
		primaryStage.show();
	}
}	
