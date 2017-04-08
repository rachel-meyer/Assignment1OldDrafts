package Ozlympics;
public class OldCodeSections {
    
	/*
	try {
	    BufferedReader br = new BufferedReader(new FileReader(Ozlympic.getAthletefile()));
	    String line=null;
	    
	    while((line=br.readLine())!=null){
		String a[]=line.split("\t");
		allAthletes.add(new Athlete(a[0],a[1],Integer.parseInt(a[2]),
			a[3],a[4],Integer.parseInt(a[5])));
	    }
	    br.close();
	}  catch (FileNotFoundException e) {
	    e.printStackTrace();
	    
	} catch (IOException e) {
	    e.printStackTrace();
	}
	
	*/
    
	/*
	ArrayList<Official> referees  = new ArrayList<Official>();
	try {
	    BufferedReader br = new BufferedReader(new FileReader(Ozlympic.getOfficialsfile()));
	    String line=null;    
	    while((line=br.readLine())!=null){
		String a[]=line.split("\t");
		referees.add(new Official(a[0],a[1],Integer.parseInt(a[2]),a[3],a[4]));
	    }	    
	br.close();   
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	*/

    
    
    /*
    try {
  	 BufferedWriter writer = new BufferedWriter(new FileWriter(Ozlympic.getAthletefile()));
  	 for(Athlete x: gameSelectPlay.getSetUp().getAllAthletes()){
  	     writer.write(x.getId()+"\t");
  	     writer.write(x.getName()+"\t");
  	     writer.write(x.getAge()+"\t");
  	     writer.write(x.getState()+"\t");
  	     writer.write(x.getType()+"\t");
  	     writer.write(x.getTotalPoints()+"\t");
  	     writer.newLine();
  	 }
  	 writer.flush();
  	 writer.close();   	
      } catch (IOException e)
      {
  	e.getStackTrace();
  	System.out.println("Error with Data File");
      }
      
      */
}
}
