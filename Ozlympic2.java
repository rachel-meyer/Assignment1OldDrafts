/**
 * The Ozylympic program is for running a set of games called the "Ozlympic Games"
 * The program can:
 * Allow the user to set up a game
 * Allow the user to select a game to run (or re-run)
 * Allow the user to predict the winner of the game
 * Run a game and award points for the top 3 competitors
 * Display a congratulation message if the user prediction is correct.
 * Display the final result of all games including the name of the referee for each game.
 * Display the points of athletes.
 * 
 * @author Rachel Meyer
 */

package Ozlympics;

import java.util.*;

public class Ozlympic {
    
    public static void main(String[] args) {
	
    ArrayList<Game> game = new ArrayList<Game>();
    ArrayList<Athlete> allAthletes  = new ArrayList<Athlete>();
    ArrayList<Official> allOfficials  = new ArrayList<Official>();
    ReadFiles file = new ReadFiles();
    file.setAllAthletes(allAthletes);
    file.setOfficials(allOfficials);
    Menu menu = new Menu();
    menu.runMenu(game, allAthletes, allOfficials);
    
    }
    
    
    public class  Menu {
	    
	    private int optionConvert;
	    private Game g;
	    private Scanner scan = new Scanner(System.in);
	       
	    
	    /*Runs all the methods in the Menu class.*/
	    public void runMenu(ArrayList<Game> game, ArrayList<Athlete> allAthletes,
	                        ArrayList<Official> allOfficials) {
	        printmenu();
	        convert();
	        menuOption(game, allAthletes, allOfficials);
	    }
	    
	    /*Prints the menu.*/
	    public final void printmenu() {
	        System.out.println("Ozlympic Games");
	        System.out.println("============================================");
	        System.out.println("1. Select a game to run");
	        System.out.println("2. Play a game");
	        System.out.println("3. Display the final results of all games");
	        System.out.println("4. Display the points of all atheletes");
	        System.out.println("5. Exit"+"\n");
	        System.out.println("Enter an option:_");
	    }
	          
	    /*Converts the user's choice from String to Integer and handles user
	     * input errors.
	     */
	    public void convert() {
	        String userChoice = scan.next();
	        
	        try {
	            optionConvert=Integer.parseInt(userChoice);
		    while (!((optionConvert>=1)&&(optionConvert<=5))) {
	                System.err.println("Oops! Please choose an option"
	                	           + " between 1 and 5"+ "\n");
			printmenu();
			convert();
		    }
		} catch (NumberFormatException e) {
	            System.err.println("Oops! Please choose an option"
	            	               + " between 1 and 5"+ "\n");
		    printmenu();
		    convert();
		}
	    }
		 
	    /*Runs the rest of the Ozlympic program based on the user choice.*/
	    public void menuOption(ArrayList<Game> game, ArrayList<Athlete> allAthletes,
		                   ArrayList<Official> allOfficials) {
	        switch (optionConvert) {
		case 1:
		    g = new Game();
		    g.createNewGame(game, allAthletes, allOfficials);
		    runMenu(game,allAthletes, allOfficials);
		    break;
		
		case 2:
		    if(game.size()==0) {
			System.out.println("Sorry you need to select a game before"
			          + " you can play a game");
		    } else if (game.get(game.size()-1).getSetUp().getEventID()==null) {
			System.out.println("Sorry you need to select a game before"
				          + " you can play a game");
		    } else { g = game.get(game.size()-1);
			g.getSetUp().cancelGame(game);
			runMenu(game, allAthletes, allOfficials);
			break;
		    }

		
		case 3:
		    Official o1 = new Official();
		    o1.summariseGames(game);
		    runMenu(game, allAthletes, allOfficials);
		    break;
		
		case 4:
		    Official o2 = new Official();
		    o2.summarisePoints(game, allAthletes); 
		    runMenu(game,allAthletes, allOfficials);
		    break;
		
		case 5:
		    System.out.println("Thanks for playing! See you next time :-)");
		    System.exit(0);
		    break;
	        }
	    }  

                
}



    

    
