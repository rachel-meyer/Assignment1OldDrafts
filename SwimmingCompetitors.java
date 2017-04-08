package Ozlympics;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SwimmingCompetitors extends Competitors {
    
    
    private Competitors [] competitors;
    private int winnerConvert;
    private Competitors winnerPrediction;
    private int gamePoints;
    private int result;

    
    
    public SwimmingCompetitors(String id, String name, String type) {
  	super(id, name, type);
  	this.result=0;
  	this.gamePoints=0;
  	
      }
      
      public SwimmingCompetitors(){
  	
      }
    
    public Competitors getWinnerPrediction(){
	return winnerPrediction;
    }
    
    public int getWinnerConvert() {
  	return winnerConvert;
      }
    
    public void setCompetitors() {
 	int length=0;
 	int j=0;
 	for (int i=0; i<ParticipantData.getParticipants().length; i++){
 	    if ((ParticipantData.getParticipants()[i].getType() =="Swimmer")||
 		      (ParticipantData.getParticipants()[i].getType() =="SuperAthlete")){
 		length++;
 	    }    
 	}
 	Competitors[] possCompetitors = new SwimmingCompetitors[length];
 	

 	for (int i=0; i<ParticipantData.getParticipants().length; i++){
 	    if ((ParticipantData.getParticipants()[i] instanceof Swimmer)||
 		      (ParticipantData.getParticipants()[i] instanceof SuperAthlete)){
 	        possCompetitors[j]= new SwimmingCompetitors(ParticipantData.getParticipants()[i].getId(),
 	        	ParticipantData.getParticipants()[i].getName(),
 	        	ParticipantData.getParticipants()[i].getType());
 	        j++;
 	  }
 	}    
 	Collections.shuffle(Arrays.asList(possCompetitors));
 	competitors = new Competitors[getAthleteNum()];	
 	for(int i=0; i<getAthleteNum(); i++){
 	    competitors[i]=possCompetitors[i];
 	    System.out.println(competitors[i].getId()+" "+competitors[i].getName());
 	}
 	System.out.println();

     }
    public void setWinnerPrediction(){
		for (int i=0; i<competitors.length; i++)
		    System.out.println(i+1+" "+competitors[i].getId()+" "+competitors[i].getName());
		String userChoice = new Scanner(System.in).next();
		try {
		    winnerConvert=(Integer.parseInt(userChoice))-1;
		    	while (!((winnerConvert>=0)&&(winnerConvert<competitors.length))) {
		    	    System.out.println("Oops! Please choose an option between 1 and "+competitors.length + "\n");
		    	    setWinnerPrediction();
		    	}
		} 
		catch (NumberFormatException e) {
	    	    System.out.println("Oops! Please choose an option between 1 and "+competitors.length + "\n");
	    	    setWinnerPrediction();
		}
		for (int i=0; i<competitors.length; i++){
		    if (winnerConvert==i){
			winnerPrediction=competitors[i];
		    }
		}
	    }
    
    public void compete() {
	for(int i=0; i<competitors.length; i++)
       ((SwimmingCompetitors)competitors[i]).result = ThreadLocalRandom.current().nextInt(100, 200 + 1);
    }
    
    public void sortResults(){
	for (int i=0; i<competitors.length; i++){
	    for (int j=i+1; j<competitors.length; j++){ 
		int temp=0;
		if(((SwimmingCompetitors)competitors[i]).result>((SwimmingCompetitors)competitors[j]).result){
		    temp=((SwimmingCompetitors)competitors[i]).result;
		    ((SwimmingCompetitors)competitors[i]).result=((SwimmingCompetitors)competitors[j]).result;
		    ((SwimmingCompetitors)competitors[i]).result=temp;	    
		}
	    }
	}
    }
    
    public void assignPoints(){
	int value=30;
	for (int i=0; i<3; i++){
	 ((SwimmingCompetitors)competitors[i]).gamePoints=value;
	 value=value-10; 
	 	if (competitors[0]==winnerPrediction){
	 	    System.out.println("Congratulations "+winnerPrediction.getId()+
	 		    " "+winnerPrediction.getName()+ " won the race!");
	 	    System.out.println("Your prediction was correct!");	     
	 	}
	}
    }
    
    
    public void displayResults(){
	System.out.println("Results for event "+Game.getEventID()+" are as follows:");
	for (int i=0; i<competitors.length; i++){
	    System.out.println("Place #"+(i+1)+competitors[i].getId()+" "+competitors[i].getName()+
		    ", "+ ((SwimmingCompetitors)competitors[i]).result+" seconds, "+
		    ((SwimmingCompetitors)competitors[i]).gamePoints+" points");
	  
	}
    }
    
    public void updateAthletes(){
	for(int i=0; i<ParticipantData.getParticipants().length; i++){
	    if(ParticipantData.getParticipants()[i].getId()==competitors[i].getId()){
		((Athlete) ParticipantData.getParticipants()[i]).setPoints(gamePoints);
	    }
	    

	}
    }
    
    



		
		
}