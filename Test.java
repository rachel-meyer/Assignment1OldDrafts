package Ozlympics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
	
	
	
//	ParticipantData data = new ParticipantData();
//	data.setParticipants();
//	new Menu();
//	Menu.runMenu();
/*	
	    ArrayList<Athlete> competitors  = new ArrayList<Athlete>();
	    ArrayList<Athlete> allAthletes = new ArrayList<Athlete>();
	   String file = "/Users/Rachel/Documents/workspace/Advanced Programming/Ozlympics/Ozlympics/AthleteData.txt";
	    
	    	String id;
	    	String name;
	    	int age;
	    	String state;
	    	String type;
	    	int points;
	    	try {
	    	    BufferedReader br = new BufferedReader(new FileReader(file));
	    	    String line=null;
	    	    
	    	    while((line=br.readLine())!=null){
	    		String temp[]=line.split("\t");
	    		id=temp[0];
	    		name=temp[1];
	    		age=Integer.parseInt(temp[2]);
	    		state = temp[3];
	    		type=temp[4];
	    		points=Integer.parseInt(temp[5]);
	    		allAthletes.add(new Athlete(id,name,age,state,type,points)); 	
	    	    }
	    	    br.close();
	    	}  catch (FileNotFoundException e) {
	    	    e.printStackTrace();
	    	    
	    	} catch (IOException e) {
	    	    e.printStackTrace();
	    	}
	    	
    		for(Athlete c: allAthletes)
	    		   if(c.getType().equals("Swimmer")){
	    		    competitors.add(new Swimmer(c.getId(),c.getName(),c.getAge(),c.getState(),c.getType(), c.getTotalPoints()));
	    		}
	    	
	    	for(Athlete c: allAthletes)
	    	System.out.println(c.getType());
	    	
		for(Athlete c: competitors)
		    	System.out.println(c.getName());
	
	     	System.out.println("Your competitors are: ");
	     	for (Athlete c: competitors)
	     	    System.out.println("ID:"+c.getId()+", "+"Name:"+c.getName());
	     	
	     	for(Athlete c: competitors)
	     	    c.setTotalPoints(20);
 /*    	
	    	String id2;
	    	String name2;
	    	int age2;
	    	String state2;
	    	String type2;
	    	String points2;
	                try {
	                 
	                    PrintWriter pw = new PrintWriter(new FileWriter(file));
	            	    BufferedReader br = new BufferedReader(new FileReader(file));
	            	    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	          
	            	    String line=null;
	            	    String line2=null;
	            	 
	                	    while((line=br.readLine())!=null){
	                		String temp[]=line.split("\t");
	                		id2=temp[0];
	        	    		name2=temp[1];
	        	    		age2=Integer.parseInt(temp[2]);
	        	    		state2 = temp[3];
	        	    		type2=temp[4];
	        	    		points2=temp[5];
	        	    		for(Athlete c : competitors)
	        	    		for(int i=0; i<competitors.size(); i++)
	                		    if(competitors.get(i).getId().equals(id2)){
	                			bw.write(c.getTotalPoints());
	                			file.replaceAll(points2, Integer.toString(competitors.get(i).getTotalPoints()));
	                		    }
	                	    }
	            	    br.close();
	            	    bw.flush();
	            	    bw.close();
	            	    
	            	}  catch (FileNotFoundException e) {
	            	    e.printStackTrace();
	            	    
	            	} catch (IOException e) {
	            	    e.printStackTrace();
	            	}

	     	
	     	
	     	
	     	int j=0;
	     	for(int i=0; i<allAthletes.size(); i++){
	     	    if(j!=competitors.size()){
	     	    if(allAthletes.get(i).getId()==competitors.get(j).getId()){
	     		allAthletes.set(i,competitors.get(j));
	     		j++;   
	     		}
	     		
	     	    }
	     	try{
	   	 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	   	 

	   	 for(Athlete x: allAthletes){
	   	     id=x.getId();
	   	     name=x.getName();
	   	     age=x.getAge();
	   	     state=x.getState();
	   	     type=x.getType();
	   	     points=x.getTotalPoints();
	   	     writer.write(id+"\t");
	   	     writer.write(name+"\t");
	   	     writer.write(age+"\t");
	   	     writer.write(state+"\t");
	   	     writer.write(type+"\t");
	   	     writer.write(points+"\t");
	   	     writer.newLine();
	   	 }
	   	 writer.flush();
	   	 writer.close();
	   	
	       } catch (IOException e)
	       {
	   	e.getStackTrace();
	       }
	     
  
try{
	 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	 

	 for(Athlete x: competitors){
	     id=x.getId();
	     name=x.getName();
	     age=x.getAge();
	     state=x.getState();
	     type=x.getType();
	     points=x.getTotalPoints();
	     writer.write(id+"\t");
	     writer.write(name+"\t");
	     writer.write(age+"\t");
	     writer.write(state+"\t");
	     writer.write(type+"\t");
	     writer.write(points+"\t");
	     writer.newLine();
	 }

	 writer.flush();
	 writer.close();
	
    } catch (IOException e)
    {
	e.getStackTrace();
    }
 
 */  
	
	
	
	
	
	
	     	
}
}

    

