/**
 * The Event Class is set up 
 *
 */

public class Event {
    
    private static int eventNum;
    private String eventType;

    
    public Event(String eventType){
	this.eventType=eventType;
    }
    
    public Event(){
	
    }

    public String getEventType() {
    return eventType; 
    }
    
    public static int getEventNum() {
	return eventNum;
    }

    public static void setEventNum() {
	eventNum++;
    }
 
}
