package Ozlympics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public abstract class Competitors extends Athlete{
    

    private int athleteNum;
    
    
    public Competitors(String id, String name, String type) {
	super(id,name,type);
    }
    
    public Competitors(){
	
    }

    public int getAthleteNum() {
	return athleteNum;
    }
   

    public void setAthleteNum(){
   	athleteNum = new Random().nextInt(9);
     	System.out.println("Looking to see how many atheletes are available..."); 	
     	if (athleteNum < 4){
     	    	athleteNum=0;

     		System.out.println("Sorry there were not enough athletes to compete");
     		System.out.println("This event has to be cancelled :-(");
     		Menu menu = new Menu();
     		menu.runMenu();
     		;	
     	}
     	else { 
    
     	    System.out.println(athleteNum + " athletes are available to compete");
     	    System.out.println("The following athletes will be competing:");
     	}   
   }
    
    public void chooseCompetitorsType(){
	
    }
    
    public abstract void compete(); 
    
    public abstract void setCompetitors();
    
    public abstract void setWinnerPrediction();
    
    public abstract Competitors getWinnerPrediction();

    public abstract void sortResults();

    public abstract void assignPoints(); 
    
    public abstract void updateAthletes();

    public abstract void displayResults(); 
    


    
}
