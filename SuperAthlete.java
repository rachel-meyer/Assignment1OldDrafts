package Ozlympics;

public class SuperAthlete extends Athlete {
    
  private int result;
    
    public SuperAthlete (String id, String name, int age, String state, String type){
	super(id, name, age, state, type);
    }
 
    public void compete() {
	// get compete based on event
    }

    public int getResult() {
	return result;
    }   
 
    public Competitors[] getCompetitors() {
	return null;
    }

    public void setCompetitors() {
    }
}
