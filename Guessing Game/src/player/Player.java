package player;
import java.util.Scanner;

public class Player {
	private String playerName;
    public int number;
  
  
public String getPlayerName() {
	return playerName;
}

Scanner scanner = new Scanner(System.in);
public void setPlayerName() {
	this.playerName = scanner.nextLine();
}


public void guess(){
	 @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in );
	 number = scanner.nextInt();
  }
}
