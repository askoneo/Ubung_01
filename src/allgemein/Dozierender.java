package allgemein;

import java.util.List;

public class Dozierender {
    String name;
    String fakultaet;  
    String bueronummer ;

  public Dozierender(String name, String fakultaet, String bueronummer){
      this.name = name;
      this.fakultaet = fakultaet;
      this.bueronummer = bueronummer;
  }
  public String empfangeneSprechstundenanfrage(Studierender studierender, String datum, String uhrzeit){
    return "Sprechstundenanfrage von " + studierender.getName() + " für den " + datum + " um " + uhrzeit + " erhalten.";

  }

  public void feedbackGeben(String feedback){
    feedbackListe.add(feedback);
    System.out.println("Feedback erhalten " + feedback);
  }

  public List<String> getFeedbackListe(){
    return feedbackListe;
  }
  public String sprechstundeAnfragen(Studierender studierender, String datum, String uhrzeit) {
    throw new UnsupportedOperationException("Unimplemented method 'sprechstundeAnfragen'");
  }

}

