import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class homescreen {
	static Scene scene;
	private Gui gui;
	private wthd mywd;
	private dep mydep;
	static user myuser;
    static Stage stage;
    private transactions mytransactions = new transactions();
    static boolean pr;
    static boolean ne;
	public homescreen(Stage stage) {
		homescreen.stage = stage;
	}
	public static void prepareScene() {
		Label select = new Label("select your transaction type");
		select.setFont(new Font("Verdana", 18));
		Button withdrawl = new Button("Withdrawl");
		Button deposit = new Button("Deposit");
		Button balanceinquiry = new Button("Balanceinquiry");
		Button next = new Button("Next");
		Button previous = new Button("Previous");
		Label balance = new Label();
		Label display = new Label();
		
		GridPane grid = new GridPane();
		grid.add(select , 0 , 0);
		grid.add(deposit , 0 , 1);
		grid.add(withdrawl , 0 , 2);
		grid.add(balanceinquiry , 0, 3);
		grid.add(balance, 1, 3);
		grid.add(next , 0 , 4);
		grid.add(previous , 0 , 5);
		grid.add(display, 0, 8);
		grid.setStyle("-fx-base: lightgreen");
		
		withdrawl.setFont(new Font("Verdana", 14));
		deposit.setFont(new Font("Verdana", 14));
		balanceinquiry.setFont(new Font("Verdana", 14));
		next.setFont(new Font("Verdana", 14));
		previous.setFont(new Font("Verdana", 14));
		withdrawl.setStyle("-fx-base: lightblue");
		deposit.setStyle("-fx-base: lightblue");
		balanceinquiry.setStyle("-fx-base: lightblue");
		next.setStyle("-fx-base: lightblue");
		previous.setStyle("-fx-base: lightblue");

		deposit.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				stage.setScene(dep.getScene());
				
			}
		});
		
		withdrawl.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				stage.setScene(wthd.getScene());
				
			}
		});
		
		balanceinquiry.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {

				balance.setText("your balance is : " + user.getBalance());
				balance.setFont(new Font("Verdana", 14));
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
				transactions.type[transactions.i] = "balance inquiry";
				transactions.amount[transactions.i] = String.valueOf(user.getBalance());
				transactions.i++;
			}
		});
		
		previous.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				if(transactions.j>4) {
					transactions.j=4;
				}
				if(ne) {
					transactions.j--;
					ne=false;
				}
				if(transactions.j<0) {
					transactions.j=0;
				}
				if(transactions.type[transactions.j] != null && transactions.amount[transactions.j] != null) {
					display.setText(transactions.type[transactions.j]+":"+transactions.amount[transactions.j]);
					display.setFont(new Font("Verdana", 14));

					transactions.j--;
				    pr=true;
				}
			}
		});
		
		next.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				if(transactions.j<4) {
					transactions.j++;
				    if(pr) {
				    	if(transactions.j==4) {
				    		pr=false;
						}
				    	else {
					    	transactions.j++;
						    pr=false;
					    }
				    }
				}    
				if(transactions.type[transactions.j] != null && transactions.amount[transactions.j] != null) {
					display.setText(transactions.type[transactions.j]+":"+transactions.amount[transactions.j]);
					display.setFont(new Font("Verdana", 14));
					ne=true;
				}
				if(transactions.j>4)
				{
					transactions.j=4;
				}
			}
		});
		
		scene = new Scene (grid , 500 , 400);
	}
	public static Scene getScene() {
		return scene;
	}

	public void setGui(Gui gui) {
		this.gui = gui;
	}
	public void setwithdrawl(wthd mywd) {
		this.mywd = mywd;
	}
	public void setdeposit(dep mydep) {
		this.mydep = mydep;
	}
	public wthd getMywd() {
		return mywd;
	}
	public void setMywd(wthd mywd) {
		this.mywd = mywd;
	}
	public dep getMydep() {
		return mydep;
	}
	public void setMydep(dep mydep) {
		this.mydep = mydep;
	}
	public transactions getMytransactions() {
		return mytransactions;
	}
	public void setMytransactions(transactions mytransactions) {
		this.mytransactions = mytransactions;
	}
	public Gui getGui() {
		return gui;
	}
}