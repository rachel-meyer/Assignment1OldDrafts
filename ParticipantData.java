package Ozlympics;

public final class ParticipantData {
    
    private static Participant[] participant = new Participant[35]; 
    
 public void setParticipants(){
   
       //swimmmers
       participant [0] = new Swimmer("sw100", "Michael Freeman", 25, "VIC", "Swimmer");
       participant [1] = new Swimmer("sw101", "Annie Duff", 22, "NSW", "Swimmer");
       participant [2] = new Swimmer("sw102", "Catherine O'Malley", 23, "NT", "Swimmer");
       participant [3] = new Swimmer("sw103", "George Olander", 28, "ACT", "Swimmer");
       participant [4] = new Swimmer("sw104", "Patrick Sullivan", 25, "NSW", "Swimmer");
       participant [5] = new Swimmer("sw105", "Mandy Smith", 19, "WA", "Swimmer");
       participant [6] = new Swimmer("sw106", "Lee Brown", 26, "TAS", "Swimmer");
       participant [7] = new Swimmer("sw107", "John Bowman", 30, "NSW", "Swimmer");
       
       //sprinters
       participant [8] = new Sprinter("sp108", "Nathan White", 26, "SA", "Sprinter");
       participant [9] = new Sprinter("sp109", "Marian Lake", 22, "VIC", "Sprinter");
       participant [10] = new Sprinter("sp110", "Timothy Corgan", 18, "QLD", "Sprinter");
       participant [11] = new Sprinter("sp111", "Rebecca McLaughlin", 20, "WA", "Sprinter");
       participant [12] = new Sprinter("sp112", "Sarah Mayes", 21, "SA", "Sprinter");
       participant [13] = new Sprinter("sp113", "Raymond Fram", 24, "NT", "Sprinter");
       participant [14] = new Sprinter("sp114", "Graham Hill", 23, "NSW", "Sprinter");
       participant [15] = new Sprinter("sp115", "Emily Port", 26, "VIC", "Sprinter");
       
       //cyclists
       participant [16] = new Cyclist ("cy116", "Melanie Pinder", 27, "QLD", "Cyclist");
       participant [17] = new Cyclist ("cy117", "Bobby Yang", 32, "TAS", "Cyclist");
       participant [18] = new Cyclist ("cy118", "Brendan Johns", 30, "ACT", "Cyclist");
       participant [19] = new Cyclist ("cy119", "Edward Holmes", 29, "WA", "Cyclist");
       participant [20] = new Cyclist ("cy120", "Lesley Min", 19, "VIC", "Cyclist");
       participant [21] = new Cyclist ("cy121", "Jack Temple", 21, "WA", "Cyclist");
       participant [22] = new Cyclist ("cy122", "Fran vanKampen", 27, "QLD", "Cyclist");
       participant [23] = new Cyclist ("cy123", "Karen Forbes", 20, "NT", "Cyclist");
       
       //super Athletes
       participant [24] = new SuperAthlete ("su124", "Robert Thomas", 24, "ACT", "Super Athlete");
       participant [25] = new SuperAthlete ("su125", "Rita Pesina", 25, "WA", "Super Athlete");
       participant [26] = new SuperAthlete ("su126", "Charlie Mahan", 28, "SA", "Super Athlete");
       participant [27] = new SuperAthlete ("su127", "Candice Wheeler", 26, "VIC", "Super Athlete");
       participant [28] = new SuperAthlete ("su128", "Derek Nickson", 22, "QLD", "Super Athlete");
       participant [29] = new SuperAthlete ("su129", "Deborah Trinh", 21, "NSW", "Super Athlete");
       participant [30] = new SuperAthlete ("su130", "Joseph Castro", 22, "NT", "Super Athlete");
       participant [31] = new SuperAthlete ("su131", "Daniel Williams", 23, "TAS", "Super Athlete");     
       
       //Officials
      participant [32] = new Official ("of132", "Richard McGowan", 36, "NSW", "Referee");
      participant [33] = new Official ("of133", "Andrea Rodriguez", 42, "VIC", "Referee");
      participant [34] = new Official ("of134", "Mervin Hardnett", 55, "QLD", "Referee");
 }
   
  public static Participant[] getParticipants() {
      return participant;
  }
}
