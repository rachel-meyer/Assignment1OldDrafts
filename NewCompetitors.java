package Ozlympics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class NewCompetitors  {

    private int athleteNum;
    private ArrayList<Athlete> competitors  = new ArrayList<Athlete>();
    private int winnerConvert;
    private Athlete winnerPrediction;
 
    
    public void setCompetitors(){
	String id;
	String name;
	int age;
	String state;
	String type;
	int points;
	ArrayList<Athlete> possCompetitors = new ArrayList<Athlete>();
	try {
	    BufferedReader br = new BufferedReader(new FileReader("AthletesData"));
	    String line=null;
	    
	    while((line=br.readLine())!=null){
		String temp[]=line.split(",");
		id=temp[0];
		name=temp[1];
		age=Integer.parseInt(temp[2]);
		state = temp[3];
		type=temp[4];
		points=Integer.parseInt(temp[5]);
		
		if((type=="Swimmer")||(type=="Super Athlete")){
		  possCompetitors.add(new Swimmer(id,name,age,state,type,points));    
		}
	    }
	    br.close();
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	
	
 	Collections.shuffle(Arrays.asList(possCompetitors));	
 	for(int i=0; i<getAthleteNum(); i++)
 	   competitors.add(i, possCompetitors.get(i));
 	 	
 	System.out.println("Your competitors are: ");
 	for (Athlete c: competitors)
 	    System.out.println("ID: "+c.getId()+", "+"Name: "+c.getName());
 	
    }
    
    public void compete(){
	for (Athlete c: competitors)
	 c.compete();
	 sortResults();
	}


    public void sortResults(){
	Collections.sort((List<Athlete>) competitors, new Comparator<Athlete>(){
	  public int compare(Athlete result1, Athlete result2) {
		return result1.getResult().compareTo(result2.getResult()) ;
	    }
	}); 
     }
    

    public void assignPoints(){
	int value=30;
	for (int i=0; i<3; i++){
	 competitors.get(i).setPoints(value);
	 value=value-10; 
	 	if (competitors.get(i)==winnerPrediction){
	 	    System.out.println("Congratulations "+winnerPrediction.getId()+
	 		    " "+winnerPrediction.getName()+ " won the race!");
	 	    System.out.println("Your prediction was correct!");	     
	 	}
	}
    }
    
    public void setWinnerPrediction(){
	boolean okay = false;
	System.out.println("The following competitors are competitng, pick a winner");
	do{
	for (int i=0; i<competitors.size(); i++)
	    System.out.println(i+1+" "+competitors.get(i).getId()+" "+competitors.get(i).getName());
	String userChoice = new Scanner(System.in).next();
	try {
	    winnerConvert=(Integer.parseInt(userChoice))-1;
	    	while (!((winnerConvert>=0)&&(winnerConvert<competitors.size()))) {
	    	    System.out.println("Oops! Please choose an option between 1 and "+competitors.size() + "\n");
	    	}
	    	okay=true;
	} 
	catch (NumberFormatException e) {
    	    System.out.println("Oops! Please choose an option between 1 and "+competitors.size() + "\n");
	}
	}while(!okay);
	
	for (int i=0; i<competitors.size(); i++){
	    if (winnerConvert==i){
		winnerPrediction=competitors.get(i);
	    }
	}
	
    }
    
    private int getAthleteNum() {
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


    
    
    
}
