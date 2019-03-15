import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class dep {
	
	static Scene scene;
	private homescreen myhomescreen;
    static Stage stage;
    static String w;
    static transactions mytransaction;
    static user myuser;
    
    public dep(Stage stage) {
  		dep.stage = stage;
  	}
      public static void prepareScene() {
      	
      	Label depositamount = new Label();
      	Button numberzero = new Button("0");
      	Button numberone = new Button("1");
      	Button numbertwo = new Button("2");
      	Button numberthree = new Button("3");
      	Button numberfour = new Button("4");
      	Button numberfive = new Button("5");
      	Button numbersix = new Button("6");
      	Button numberseven = new Button("7");
      	Button numbereight = new Button("8");
      	Button numbernine = new Button("9");
      	Button enter = new Button("Enter");
      	Label result = new Label();
      	Button erase = new Button("Erase");
      	Button Return = new Button("Return");
      	
      	GridPane grid = new GridPane();
    	grid.add(numberone,0,1);
    	grid.add(numbertwo,1,1);
    	grid.add(numberthree,2,1);
    	grid.add(numberfour,0,2);
    	grid.add(numberfive,1,2);
    	grid.add(numbersix,2,2);
    	grid.add(numberseven,0,3);
    	grid.add(numbereight,1,3);
    	grid.add(numbernine,2,3);
    	grid.add(numberzero,1,4);
    	grid.add(enter, 2, 5);
    	grid.add(depositamount,2,0);
    	grid.add(result, 3, 6);
    	grid.add(erase, 2, 7);
    	grid.add(Return, 600, 400);
        grid.setStyle("-fx-base: lightblue");
    	
        numberzero.setFont(new Font("Verdana", 14));
        numberone.setFont(new Font("Verdana", 14));
        numbertwo.setFont(new Font("Verdana", 14));
        numberthree.setFont(new Font("Verdana", 14));
        numberfour.setFont(new Font("Verdana", 14));
        numberfive.setFont(new Font("Verdana", 14));
        numbersix.setFont(new Font("Verdana", 14));
        numberseven.setFont(new Font("Verdana", 14));
        numbereight.setFont(new Font("Verdana", 14));
        numbernine.setFont(new Font("Verdana", 14));
        enter.setFont(new Font("Verdana", 14));
        erase.setFont(new Font("Verdana", 14));
        Return.setFont(new Font("Verdana", 14));
        
        numberzero.setStyle("-fx-base: lightgreen");
    	numberone.setStyle("-fx-base: lightgreen");
    	numbertwo.setStyle("-fx-base: lightgreen");
    	numberthree.setStyle("-fx-base: lightgreen");
    	numberfour.setStyle("-fx-base: lightgreen");
    	numberfive.setStyle("-fx-base: lightgreen");
    	numbersix.setStyle("-fx-base: lightgreen");
    	numberseven.setStyle("-fx-base: lightgreen");
    	numbereight.setStyle("-fx-base: lightgreen");
    	numbernine.setStyle("-fx-base: lightgreen");
    	enter.setStyle("-fx-base: white");
    	erase.setStyle("-fx-base: white");
    	Return.setStyle("-fx-base: white");
    	
    	depositamount.setFont(new Font("Verdana", 14));
    	numberone.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"1");
				
			}
		});
    	
    	numbertwo.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"2");
				
			}
		});
    	
    	numberthree.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"3");
				
			}
		});
    	
    	numberfour.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"4");
				
			}
		});
    	
    	numberfive.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"5");
				
			}
		});
    	
    	numbersix.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"6");				
			}
		});
    	
    	numberseven.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"7");				
			}
		});
    	
    	numbereight.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"8");				
			}
		});
    	
    	numbernine.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"9");				
			}
		});
    	
    	numberzero.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText(depositamount.getText()+"0");				
			}
		});
    	
    	erase.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				depositamount.setText("");
				
			}
		});
    	
    	enter.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				if(depositamount.getText() == "") {
					result.setText("enter an amount of money");
					result.setFont(new Font("Verdana", 14));
				}
				else {
				    result.setText(depositamount.getText() + "  has been added to your acount");
				    int depositam = Integer.parseInt(depositamount.getText());
				    int mybalance = user.getBalance();
				    mybalance+= depositam;	
				    user.setBalance(mybalance);
				    if(transactions.i==5) {
					
				    	transactions.type[0] = transactions.type[1];
					    transactions.amount[0] = transactions.amount[1];		
					    transactions.type[1] = transactions.type[2];
					    transactions.amount[1] = transactions.amount[2];
					    transactions.type[2] = transactions.type[3];
					    transactions.amount[2] = transactions.amount[3];
					    transactions.type[3] = transactions.type[4];
					    transactions.amount[3] = transactions.amount[4];
					
				    }
				    transactions.i = 4;
				    transactions.type[transactions.i] = "deposit";
				    transactions.amount[transactions.i] = String.valueOf(depositam);
				    transactions.i++;
				}
			}
		});
    	
    	Return.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				stage.setScene(homescreen.getScene());
				
			}
		});
    	
    	scene = new Scene (grid , 500 , 400);
      	
      }
      	
	 public static Scene getScene() {
			return scene;
		}
	    public void setmyhomescreen(homescreen myhomescreen) {
			this.myhomescreen = myhomescreen;
		}
		public homescreen getMyhomescreen() {
			return myhomescreen;
		}
		public void setMyhomescreen(homescreen myhomescreen) {
			this.myhomescreen = myhomescreen;
		}
}