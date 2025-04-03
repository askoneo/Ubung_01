package allgemein;

import java.util.List;

public class Dozierender {

  private String name;
  private String fakultaet;
  private String bueronummer;
  private String[] feedbacks;
  private int feedbackCount;

  public Dozierender(String name, String fakultaet, String bueronummer) {
      this.name = name;
      this.fakultaet = fakultaet;
      this.bueronummer = bueronummer;
      this.feedbacks = new String[10]; // Max. Anzahl
      this.feedbackCount = 0;
  }

  public String getName() {
      return name;
  }

  public void frageBeantworten(Studierender student, String antwort) {
  System.out.println(name + " antwortet " + student.getName() + ": " + antwort);
}

  public void sprechstundenBestätigung(Studierender student, String datum, String uhrzeit) {
  System.out.println(name + " bestätigt den Termin mit " + student.getName() + " am " + datum + " um " + uhrzeit + " in Raum " + bueronummer + ".");
}
  public void feedbackErhalten(Studierender student, String nachricht) {
      if (feedbackCount < feedbacks.length) {
      feedbacks[feedbackCount] = student.getName() + ": " + nachricht;
      feedbackCount++;
      System.out.println(name + " hat neues Feedback von " + student.getName() + " erhalten.");
  } else {
      System.out.println("Feedback-Speicher ist voll! Keine weiteren Feedbacks möglich.");
  }
}

// Methode zum Anzeigen aller Feedbacks
public void feedbackAnzeigen() {
  System.out.println("Feedback für " + name + ":");
  if (feedbackCount == 0) {
      System.out.println("Noch kein Feedback vorhanden.");
  } else {
      for (int i = 0; i < feedbackCount; i++) {
          System.out.println("- " + feedbacks[i]);
      }
  }
}
}
