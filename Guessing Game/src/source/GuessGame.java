package source;
import player.Player;

public class GuessGame implements myInterface {
  private Player p1;
  private Player p2;
  private Player p3;	

		
  public void startGame() {
	  p1= new Player();
	  p2= new Player();
	  p3= new Player();
	  System.out.println("player1: Enter your name: ");
	  p1.setPlayerName();
	  System.out.println("player2: Enter your name");
	  p2.setPlayerName();
	  System.out.println("player3: Enter your name");
	  p3.setPlayerName();
	 String player1=p1.getPlayerName();
	 String player2=p2.getPlayerName();
	 String player3=p3.getPlayerName();
	  
	  int guessp1 = 0;
	  int guessp2 = 0;
	  int guessp3 = 0;
	  
	  boolean p1isRight = false;
	  boolean p2isRight = false;
	  boolean p3isRight = false;
	  
	  int targetNumber = (int) (Math.random() * 10);
	  System.out.println("i am thinking of a number btw 0 and 9... Guess the number!");
	  System.out.println(".............................");
	  
	  while (true) {
		  System.out.println(player1+"\'s turn");
		  p1.guess();
			  guessp1 = p1.number;
		  System.out.println(player1 + " guessed: "+ guessp1);
		  System.out.println("====================================");
		  
		  System.out.println(player2 +"\'s turn");
		  p2.guess();
		  guessp2 = p2.number;
		  System.out.println(player2+" guessed: "+ guessp2 );
		  System.out.println("====================================");
		  
		  System.out.println(player3 +"\'s turn");
		  p3.guess();
		  guessp3 = p3.number;
		  System.out.println(player3+" guessed: "+ guessp3);
		  System.out.println("===================================="); 
		  
		  //checking players guess
		  if(guessp1==targetNumber) {
			  p1isRight=true;
		  }
		  if(guessp2==targetNumber) {
			  p2isRight=true;
		  }
		  if(guessp3==targetNumber) {
			  p3isRight=true;
		  }
		  System.out.println("The number i am thinking is: " + targetNumber);
		  if (p1isRight||p2isRight||p3isRight) {
			  System.out.println("we have a winner!");
			  if (p1isRight) {
			  System.out.println(player1 + " got it right");
			  }
			  else if(p2isRight) {
			  System.out.println(player2+" got it right ");
			  }
			  else if(p3isRight) {
			  System.out.println(player3 + " got it right ");
			  }
			  System.out.println("Game is over.");
			  System.out.println(".................................");
			 
			  break;
		  }
		  else {
			System.out.println("no one got it right!... try again");
			System.out.println("...................................");
			
			 } 
		  
	  }
  }
}
