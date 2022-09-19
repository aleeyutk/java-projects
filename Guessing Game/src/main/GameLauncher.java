package main;

import java.util.Scanner;

import source.GuessGame;
import source.Hard;

public class GameLauncher {
 public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	 while(true) {
		 int mode;
		 System.out.println("---GUESSING GAME---");
		 System.out.println("select an option to play...\nMODES");
		 System.out.println("1. EASY \n2. HARD \nEnter 3 to exit.");
		 System.out.println("=================================");
		 mode = scanner.nextInt();
		 
		 if (mode==1) {
		GuessGame game = new GuessGame();
		game.startGame();
		 }
		 else if(mode==2) {
			 Hard gm=new Hard();
			 gm.startGame();
		 }
		 
		 else if(mode!=1||mode!=2) {
			break;
		}
		 
	 }
 }
 }