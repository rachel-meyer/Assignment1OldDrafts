package Ozlympics;

import java.util.*;
public class SelectGame {
	
    
    
    private int athleteConvert;
    private String type;
    private Random r = new Random ();
    private Scanner scan = new Scanner(System.in);
    
   
	
  
	   		
       try {
	   eventConvert=Integer.parseInt(eventChoice);
	   while (!((eventConvert>=1)&&(eventConvert<=4))) {
	       System.out.println("Oops!"+ "\n");
	       selectevent();
	       }
	   } 
       catch (NumberFormatException e) {
	   System.out.println("Oops!"+ "\n");
	   selectevent();
	   }
   }

   public int getEventchoice() {
       return eventConvert;
   }
       
       
   public void choice(){
       
       if (eventConvert==1) { 
	   Event swimming = new Swimming('s');
	   Event.setEventNum();
	   ((Swimming) swimming).eventID();
	   swimming.setAthleteNum();
	   ((Swimming) swimming).setCompetitors();
	  // swimming.getOfficial();
	   }
       else if (eventConvert==2) {
	   Event cycling = new Swimming('c');
	   }
       else if (eventConvert==3) {
	   Event running = new Swimming('r');
	   }
       else if (eventConvert==4) {
	   Menu.printmenu();
	   Menu choice = new Menu();
	   choice.convert();
	   choice.menuOption();
	   }
       }
}   

					  	 

			  		 

		
   
   
 
   

